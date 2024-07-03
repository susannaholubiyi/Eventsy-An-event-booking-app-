package com.eventbookingapp.eventsy.eventsy.services;

import com.eventbookingapp.eventsy.eventsy.dtos.requests.CreateEventRequest;
import com.eventbookingapp.eventsy.eventsy.dtos.responses.CreateEventResponse;
import com.eventbookingapp.eventsy.eventsy.exceptions.EventAlreadyExistsException;
import com.eventbookingapp.eventsy.eventsy.models.Address;
import com.eventbookingapp.eventsy.eventsy.models.Event;
import com.eventbookingapp.eventsy.eventsy.repositories.AddressRepository;
import com.eventbookingapp.eventsy.eventsy.repositories.EventRepository;
import com.eventbookingapp.eventsy.eventsy.repositories.OrganiserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EventsyEventServices implements EventServices{
    private final EventRepository eventRepository;
    private final ModelMapper modelMapper;
    private final AddressRepository addressRepository;
    private final OrganiserRepository organiserRepository;
    public EventsyEventServices(EventRepository eventRepository,
                                AddressRepository addressRepository,
                                OrganiserRepository organiserRepository,
                                ModelMapper modelMapper){
        this.eventRepository = eventRepository;
        this.modelMapper= modelMapper;
        this.addressRepository = addressRepository;
        this.organiserRepository = organiserRepository;
    }

    @Override
    public CreateEventResponse createEvent(CreateEventRequest createEventRequest) {
        Event event = eventRepository.findByEventName(createEventRequest.getEventName())
                .orElseThrow(()-> new EventAlreadyExistsException("Event with this name already exists"));
        Address address = createEventAddress(createEventRequest);


        return null;
    }

    private Address createEventAddress(CreateEventRequest createEventRequest) {
        Address address = new Address();
        address.setHouseNo(createEventRequest.getHouseNo());
        address.setStreetName(createEventRequest.getStreetName());
        address.setCity(createEventRequest.getCity());
        address.setCountry(createEventRequest.getCountry());
        return addressRepository.save(address);
    }
}
