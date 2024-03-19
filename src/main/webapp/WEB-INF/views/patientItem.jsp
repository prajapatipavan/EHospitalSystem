<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Record</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Your CSS styles here */
    </style>
</head>
<body>

<div class="container">
    <center><h2 class="mt-4">Add Patient_Item</h2></center>
    <form action="savepatientitem" method="post" id="patientItemForm">
        <div class="form-group">
            <label for="patientId">Patient:</label>
            <select class="form-control" name="patientId" id="patientId">
                <option value="-1">----Patient----</option>
                <c:forEach items="${patient}" var="patient">
                    <option value="${patient.patientId}">${patient.firstName} ${patient.lastName}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group" id="itemFields">
            <!-- Item select dropdowns with quantity fields will be added dynamically -->
        </div>

        <button type="button" class="btn btn-secondary" onclick="addItemField()">Add Item</button>

        <div class="form-group">
            <label for="date">Date:</label>
            <input type="date" class="form-control" id="date" name="date">
        </div>

        <div class="form-group">
            <label for="totalQuantity">Total Quantity:</label>
            <input type="text" class="form-control" id="totalQuantity" name="qty" value="0" readonly>
        </div>
        <div class="form-group">
            <label for="totalPrice">Total Price:</label>
            <input type="text" class="form-control" id="totalPrice" name="totalPrice" readonly>
        </div>

        <div class="selected-items mt-4">
            <h3>Selected Items</h3>
            <ul id="selectedItemsList"></ul>
        </div>
        <input type="submit" class="btn btn-primary" value="Add PatientItem">
    </form>
</div>

<!-- Bootstrap JavaScript files and your custom JavaScript -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<script>
var itemCount = 1; // Initial item count

function addItemField() {
    var itemFieldsDiv = document.getElementById("itemFields");

    // Create a new div to hold the item fields
    var newItemDiv = document.createElement("div");
    newItemDiv.classList.add("form-group");

    // Create label for the item select
    var itemLabel = document.createElement("label");
    itemLabel.innerHTML = "Item " + itemCount + ":";
    newItemDiv.appendChild(itemLabel);

    // Create the select element for the item
    var itemSelect = document.createElement("select");
    itemSelect.classList.add("form-control", "item-select");
    itemSelect.setAttribute("name", "itemIds[]"); // Note the brackets to treat as array
    itemSelect.innerHTML = `
        <option value="-1">----Item----</option>
        <c:forEach items="${item}" var="item">
            <option value="${item.itemId}" data-price="${item.price}">${item.materialgName} - ${item.price}</option>
        </c:forEach>
    `;
    newItemDiv.appendChild(itemSelect);

    // Create the quantity controls
    var quantityControlsDiv = document.createElement("div");
    quantityControlsDiv.classList.add("quantity-controls");

    var decrementButton = document.createElement("button");
    decrementButton.type = "button";
    decrementButton.classList.add("btn", "btn-quantity", "btn-danger");
    decrementButton.textContent = "-";
    decrementButton.onclick = function() { decrementQuantity(this); }; // Pass the button element to the decrement function
    quantityControlsDiv.appendChild(decrementButton);

    var quantityInput = document.createElement("input");
    quantityInput.type = "text";
    quantityInput.classList.add("form-control", "item-quantity");
    quantityInput.value = "0";
    quantityInput.readOnly = true; 
    quantityControlsDiv.appendChild(quantityInput);

    var incrementButton = document.createElement("button");
    incrementButton.type = "button";
    incrementButton.classList.add("btn", "btn-quantity", "btn-success");
    incrementButton.textContent = "+";
    incrementButton.onclick = function() { incrementQuantity(this); }; // Pass the button element to the increment function
    quantityControlsDiv.appendChild(incrementButton);

    newItemDiv.appendChild(quantityControlsDiv);

    // Append the new item fields to the main container
    itemFieldsDiv.appendChild(newItemDiv);

    // Increment item count for the next item
    itemCount++;
}

// Function to handle incrementing the quantity
function incrementQuantity(buttonElement) {
    var quantityInput = $(buttonElement).siblings('.item-quantity');
    var currentValue = parseInt(quantityInput.val());
    quantityInput.val(currentValue + 1);
    calculateTotal(); // Recalculate total after incrementing
}

// Function to handle decrementing the quantity
function decrementQuantity(buttonElement) {
    var quantityInput = $(buttonElement).siblings('.item-quantity');
    var currentValue = parseInt(quantityInput.val());
    if (currentValue > 0) {
        quantityInput.val(currentValue - 1);
        calculateTotal(); // Recalculate total after decrementing
    }
}

// On form submission, calculate the total price and total quantity
document.getElementById("patientItemForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form submission
    calculateTotal(); // Calculate total price

    // Update totalPrice[] inputs with individual prices
    var itemPrices = document.querySelectorAll('.item-select');
    itemPrices.forEach(function(selectElement, index) {
        var selectedOption = selectElement.options[selectElement.selectedIndex];
        var priceInput = document.createElement('input');
        priceInput.type = 'hidden';
        priceInput.name = 'totalPrice[]';
        priceInput.value = selectedOption.dataset.price;
        document.getElementById('patientItemForm').appendChild(priceInput);
    });

    // Update qty[] inputs with individual quantities
    var itemQuantities = document.querySelectorAll('.item-quantity');
    itemQuantities.forEach(function(quantityInput, index) {
        var qtyInput = document.createElement('input');
        qtyInput.type = 'hidden';
        qtyInput.name = 'qty[]';
        qtyInput.value = quantityInput.value;
        document.getElementById('patientItemForm').appendChild(qtyInput);
    });

    this.submit();
});

// Calculate total price based on selected items
function calculateTotal() {
    var itemPrices = $('.item-select');
    var totalPrice = 0;
    var totalQuantity = 0;
    itemPrices.each(function() {
        var selectedOption = $(this).find('option:selected');
        var price = parseFloat(selectedOption.data('price'));
        var quantity = parseInt($(this).closest('.form-group').find('.item-quantity').val());
        totalPrice += price * quantity;
        totalQuantity += quantity;
    });
    $('#totalPrice').val(totalPrice.toFixed(2));
    $('#totalQuantity').val(totalQuantity);
}
</script>

</body>
</html>
