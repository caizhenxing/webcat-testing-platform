package com.byclosure.webcattestingplatform.exceptions;

public class InvalidWebDriverInstanceException extends RuntimeException {

    public InvalidWebDriverInstanceException() {
    }

    public InvalidWebDriverInstanceException(Exception e) {
    }

    public InvalidWebDriverInstanceException(String message) {
        super(message);
    }
}
