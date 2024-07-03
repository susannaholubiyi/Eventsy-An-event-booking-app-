package com.eventbookingapp.eventsy.eventsy.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterOrganiserResponse {
    private Long id;
    private String message;
    private String email;
}
