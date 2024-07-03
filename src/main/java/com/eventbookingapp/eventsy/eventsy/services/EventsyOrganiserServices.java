package com.eventbookingapp.eventsy.eventsy.services;

import com.eventbookingapp.eventsy.eventsy.dtos.requests.RegisterOrganiserRequest;
import com.eventbookingapp.eventsy.eventsy.dtos.responses.RegisterOrganiserResponse;
import com.eventbookingapp.eventsy.eventsy.models.Organiser;
import com.eventbookingapp.eventsy.eventsy.repositories.OrganiserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EventsyOrganiserServices implements OrganiserServices{
    private final OrganiserRepository organiserRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    @Autowired
    public EventsyOrganiserServices(OrganiserRepository organiserRepository,
                                    ModelMapper modelMapper,
                                    PasswordEncoder passwordEncoder){
        this.organiserRepository = organiserRepository;
        this.modelMapper =modelMapper;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public RegisterOrganiserResponse register(RegisterOrganiserRequest request) {
        Organiser organiser = modelMapper.map(request, Organiser.class);
        organiser.setPassword(passwordEncoder.encode(request.getPassword()));
        organiser = organiserRepository.save(organiser);
        var response = modelMapper.map(organiser, RegisterOrganiserResponse.class);
        response.setMessage("Organiser registered successfully");
        return response;
    }



}
