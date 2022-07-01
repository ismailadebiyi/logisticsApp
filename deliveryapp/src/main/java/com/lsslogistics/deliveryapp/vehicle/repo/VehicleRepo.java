package com.lsslogistics.deliveryapp.vehicle.repo;

import com.lsslogistics.deliveryapp.vehicle.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {
    @Query("select v from Vehicle v where v.registrationNo = ?1")
    Optional<Vehicle> findVehicleByRegistrationNo(String registrationNo);
}
