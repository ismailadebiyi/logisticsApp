package com.lsslogistics.deliveryapp.items.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Item Not Found")
public class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException(){

    }

}
