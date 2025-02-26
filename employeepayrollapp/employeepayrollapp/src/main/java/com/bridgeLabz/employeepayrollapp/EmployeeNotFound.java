package com.bridgeLabz.employeepayrollapp;

public class EmployeeNotFound extends RuntimeException{
    public EmployeeNotFound(String message){
        super(message);
    }
}
