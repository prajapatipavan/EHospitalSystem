package com.Arth.Repositry;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.PaymentsEntity;


@Repository
public interface PaymentsRepositry extends JpaRepository<PaymentsEntity, Integer> {

	PaymentsEntity findByDate(String date);

}
