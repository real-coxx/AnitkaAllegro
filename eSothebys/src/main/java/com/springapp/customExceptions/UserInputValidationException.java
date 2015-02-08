package com.springapp.customExceptions;

/**
 * Created by Internet on 2015-02-08.
 */
public class UserInputValidationException extends Exception {

    public UserInputValidationException(String message){
        super(message);
    }

}
