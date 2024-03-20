<
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:if test="${empty admin}">

	<c:redirect url="login" />
</c:if>


<div class="header">
	<div class="header-left">
		<a href="index-2.html" class="logo"> <img
			src="assets/img/logo.png" width="35" height="35" alt=""> <span>EHOSPITAL</span>
		</a>
	</div>
	<a id="toggle_btn" href="javascript:void(0);"><i class="fa fa-bars"></i></a>
	<a id="mobile_btn" class="mobile_btn float-left" href="#sidebar"><i
		class="fa fa-bars"></i></a>


	<ul class="nav user-menu float-left">

		<li class="nav-item dropdown has-arrow"><a href="#"> <span
				class="user-img"> </span> <span>HOME</span>
		</a></li>

	</ul>

	<ul class="nav user-menu float-right">




		<li class="nav-item dropdown has-arrow"><a href="#"
			class="dropdown-toggle nav-link user-link" data-toggle="dropdown">
				<span class="user-img"> <img class="rounded-circle"
					src="assets/img/user.jpg" width="24" alt="Admin"> <span
					class="status online"></span>
			</span> <span>${admin.email}</span>
		</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="AdminProfile?id=${admin.adminId}">My
					Profile</a> <a class="dropdown-item" href="logout">Logout</a>
			</div></li>
	</ul>

</div>
