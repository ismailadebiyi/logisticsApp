package com.lsslogistics.deliveryapp.users.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Staff Not Found")
public class StaffNotFoundException extends RuntimeException{

    public StaffNotFoundException(){

    }
}
