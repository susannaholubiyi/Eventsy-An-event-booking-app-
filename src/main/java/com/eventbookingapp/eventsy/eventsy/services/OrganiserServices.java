package com.eventbookingapp.eventsy.eventsy.services;

import com.eventbookingapp.eventsy.eventsy.dtos.requests.RegisterOrganiserRequest;
import com.eventbookingapp.eventsy.eventsy.dtos.responses.RegisterOrganiserResponse;

public interface OrganiserServices {
    RegisterOrganiserResponse register(RegisterOrganiserRequest request);
}
