package com.java.exceptionhandler;

public class NotEligibleException extends Exception {
    String status ;
    public NotEligibleException(String message, int age){
        super(message+ age);
    }

}
