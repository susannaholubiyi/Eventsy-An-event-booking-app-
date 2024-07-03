package com.eventbookingapp.eventsy.eventsy.services;

import com.eventbookingapp.eventsy.eventsy.dtos.requests.CreateEventRequest;
import com.eventbookingapp.eventsy.eventsy.dtos.responses.CreateEventResponse;
import com.eventbookingapp.eventsy.eventsy.models.Event;

public interface EventServices {
    CreateEventResponse createEvent(CreateEventRequest createEventRequest);
}
