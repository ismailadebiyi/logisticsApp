package com.lsslogistics.deliveryapp.users.repo;

import com.lsslogistics.deliveryapp.users.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Long> {
}
