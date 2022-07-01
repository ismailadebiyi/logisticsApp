package com.lsslogistics.deliveryapp.users.controllers;

import com.lsslogistics.deliveryapp.users.model.Staff;
import com.lsslogistics.deliveryapp.users.requests.StaffCreationRequest;
import com.lsslogistics.deliveryapp.users.service.StaffService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/staff")
@Slf4j
public record StaffController(StaffService staffService) {

    //TODO: createStaff, editStaffDetails, disableStaff, getAllStaffs, getStaffByStaffId,,

    @PostMapping
    public void createStaff(@RequestBody StaffCreationRequest staffCreationRequest){

        log.info("New Staff creation {}", staffCreationRequest);
        staffService.createStaff(staffCreationRequest);
    }

    @GetMapping
    public List<Staff> getAllStaff(){
        return null;
    }

    @GetMapping("/{staffId}")
    public Staff getStaffById(@PathVariable String staffId){
        return null;
    }

    @PostMapping("/{staffId}")
    public void updateStaffDetails(@PathVariable String staffId){

    }

    @PostMapping("/{staffId}")
    public void disableStaff(@PathVariable String staffId){

    }


}
