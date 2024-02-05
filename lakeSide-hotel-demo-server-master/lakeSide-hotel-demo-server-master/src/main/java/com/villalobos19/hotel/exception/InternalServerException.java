package com.villalobos19.hotel.exception;


public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
