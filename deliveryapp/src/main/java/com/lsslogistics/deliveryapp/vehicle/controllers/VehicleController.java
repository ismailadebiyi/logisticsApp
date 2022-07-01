package com.lsslogistics.deliveryapp.vehicle.controllers;

import com.lsslogistics.deliveryapp.vehicle.model.Vehicle;
import com.lsslogistics.deliveryapp.vehicle.requests.VehicleAddRequest;
import com.lsslogistics.deliveryapp.vehicle.service.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/vehicle")
@Slf4j
public record VehicleController(VehicleService vehicleService) {

    @PostMapping
    public void addVehicle(@RequestBody VehicleAddRequest vehicleAddRequest){

    }

    @GetMapping
    public List<Vehicle> getAllVehicle(){
        //TODO: get all vehicle
        return null;
    }

    @GetMapping("/{registrationNo}")
    public Vehicle getVehicleByRegistrationNo(@PathVariable String registrationNo){
        //TODO: check if vehicle is available, return vehicle else return exception
        return null;
    }

    @PostMapping("/assign/{registrationNo}")
    public void assignVehicleToStaff(@PathVariable String registrationNo){

    }

    @PostMapping("/unAssign/{registrationNo}")
    public void unAssignVehicleToStaff(@PathVariable String registrationNo){

    }

    @PostMapping("/{id}")
    public void delete( @PathVariable Long id){

    }



}
