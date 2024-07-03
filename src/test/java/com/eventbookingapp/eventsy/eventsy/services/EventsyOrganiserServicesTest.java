package com.eventbookingapp.eventsy.eventsy.services;

import com.eventbookingapp.eventsy.eventsy.dtos.requests.RegisterOrganiserRequest;
import com.eventbookingapp.eventsy.eventsy.dtos.responses.RegisterOrganiserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Sql(scripts = {"/db/data.sql"})
public class EventsyOrganiserServicesTest {
    @Autowired
    private OrganiserServices organiserService;
    @Test
    public void testRegisterOrganiser(){
        RegisterOrganiserRequest request = new RegisterOrganiserRequest();
        request.setEmail("Jane@email.com");
        request.setPassword("password");
        request.setPhoneNumber("08106317491");
        RegisterOrganiserResponse response = organiserService.register(request);
        assertNotNull(response);
        assertTrue(response.getMessage().contains("success"));


    }
    @Test
    public void testCreateEvent(){

    }
}
