package com.sapient.asde.exception;

public class EmployeeException extends Exception{
    public EmployeeException() {
        super();
    }

    public EmployeeException(String message) {
        super(message);
    }

    public EmployeeException(String message, Throwable cause) {
        super(message, cause);
    }
}
