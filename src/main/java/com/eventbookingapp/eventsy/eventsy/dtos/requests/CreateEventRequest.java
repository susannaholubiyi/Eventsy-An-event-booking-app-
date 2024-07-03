package com.eventbookingapp.eventsy.eventsy.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateEventRequest {
    private String eventName;
    private String eventDescription;
    private String houseNo;
    private String streetName;
    private String city;
    private String country;
    private Long organiserId;
}
