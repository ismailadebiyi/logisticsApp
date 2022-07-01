package com.lsslogistics.deliveryapp.users.repo;

import com.lsslogistics.deliveryapp.users.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
