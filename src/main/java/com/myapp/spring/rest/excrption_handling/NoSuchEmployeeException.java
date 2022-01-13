package com.myapp.spring.rest.excrption_handling;

public class NoSuchEmployeeException extends RuntimeException{

    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
