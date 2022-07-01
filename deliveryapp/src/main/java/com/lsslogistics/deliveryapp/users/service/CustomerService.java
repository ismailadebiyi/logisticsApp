package com.lsslogistics.deliveryapp.users.service;

import com.lsslogistics.deliveryapp.users.model.Customer;
import com.lsslogistics.deliveryapp.users.repo.CustomerRepo;
import com.lsslogistics.deliveryapp.users.requests.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CustomerService(CustomerRepo customerRepo) {

    public void registerCustomer(CustomerRegistrationRequest request){
        //Todo: check for email in db
        //
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .address(request.address())
                .phoneNumber(request.phoneNumber())
                .build();

        customerRepo.save(customer);
    }

    public List<Customer> getAllCustomers(){
        return null;
    }
}
