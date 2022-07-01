package com.lsslogistics.deliveryapp.users.service;

import com.lsslogistics.deliveryapp.users.exceptions.StaffNotFoundException;
import com.lsslogistics.deliveryapp.users.model.Staff;
import com.lsslogistics.deliveryapp.users.repo.StaffRepo;
import com.lsslogistics.deliveryapp.users.requests.StaffCreationRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record StaffService(StaffRepo staffRepo) {

    public void createStaff(StaffCreationRequest request){
        Staff staff = Staff.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .address(request.address())
                .email(request.email())
                .staffId(generateStaffId())
                .build();

        staffRepo.save(staff);
    }

    public List<Staff> getAllStaff(){
        return staffRepo.findAll();
    }

    public Staff getStaffById(Long staffId){

        return staffRepo.findById(staffId).orElseThrow(StaffNotFoundException::new);

    }

    private String generateStaffId(){
        return "LSS-001";
    }
}
