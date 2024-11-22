package com.neoteric.dockerlearning.exception;

public class InsufficientBalanceException extends Exception {

    private String code;

    public InsufficientBalanceException(String code, String message, Throwable throwable, Throwable throwable1){
            super(message,throwable);
            this.code = code;

    }

    public String getCode() {
        return code;
    }



}
