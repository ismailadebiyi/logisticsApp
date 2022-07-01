package com.lsslogistics.deliveryapp.vehicle.service;

import com.lsslogistics.deliveryapp.vehicle.exception.VehicleNotFoundException;
import com.lsslogistics.deliveryapp.vehicle.model.Vehicle;
import com.lsslogistics.deliveryapp.vehicle.repo.VehicleRepo;
import com.lsslogistics.deliveryapp.vehicle.requests.VehicleAddRequest;
import com.lsslogistics.deliveryapp.vehicle.requests.VehicleAssignmentRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record VehicleService(VehicleRepo vehicleRepo) {

    public void addVehicle(VehicleAddRequest request){

        Vehicle vehicle = Vehicle.builder()
                .manufacturer(request.manufacturer())
                .registrationNo(request.registrationNo())
                .type(request.type())
                .build();
        vehicleRepo.save(vehicle);
    }

    public List<Vehicle> getAllVehicle(){
        return vehicleRepo.findAll();
    }

    public Vehicle getVehicleByRegNo(String registrationNo){

        return vehicleRepo.findVehicleByRegistrationNo(registrationNo)
                .orElseThrow(VehicleNotFoundException::new);
    }

    public Vehicle assignVehicleToStaff(VehicleAssignmentRequest request){
        return vehicleRepo.findVehicleByRegistrationNo(request.registrationNo())
                .map(assignStaff->{ assignStaff.setStaff(request.staff());
                    return vehicleRepo.save(assignStaff);
                }).orElseThrow(VehicleNotFoundException::new);

    }


    public void deleteVehicle(Long vehicleId){
        vehicleRepo.findById(vehicleId)
                .orElseThrow(VehicleNotFoundException::new);
        vehicleRepo.deleteById(vehicleId);
    }

}
