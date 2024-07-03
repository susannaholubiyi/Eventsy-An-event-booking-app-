package com.eventbookingapp.eventsy.eventsy.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterOrganiserRequest {
    private String email;
    private String password;
    private String phoneNumber;
}
