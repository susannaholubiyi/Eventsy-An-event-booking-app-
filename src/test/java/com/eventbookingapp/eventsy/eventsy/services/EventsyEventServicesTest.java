package com.eventbookingapp.eventsy.eventsy.services;

import com.eventbookingapp.eventsy.eventsy.dtos.requests.CreateEventRequest;
import com.eventbookingapp.eventsy.eventsy.dtos.responses.CreateEventResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class EventsyEventServicesTest {
    @Autowired
    private EventServices eventServices;
    @Test
    public void testCreateEvent(){
        CreateEventRequest request = new CreateEventRequest();
        request.setEventName("wedding ceremony");
        request.setEventDescription("the joining together of two liars");
        request.setHouseNo("5");
        request.setStreetName("jones street");
        request.setCity("new city");
        request.setCountry("heaven");
        CreateEventResponse response = eventServices.createEvent(request);
        assertNotNull(response);
        assertTrue(response.getMessage().contains("success"));
    }

}