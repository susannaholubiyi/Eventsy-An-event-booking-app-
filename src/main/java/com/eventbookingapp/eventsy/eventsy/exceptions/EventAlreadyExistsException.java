package com.eventbookingapp.eventsy.eventsy.exceptions;

public class EventAlreadyExistsException extends EventsyAppException{
    public EventAlreadyExistsException(String message){
        super(message);
    }
}
