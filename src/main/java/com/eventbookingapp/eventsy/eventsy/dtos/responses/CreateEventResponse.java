package com.eventbookingapp.eventsy.eventsy.dtos.responses;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class CreateEventResponse {
    private Long id;
    private String message;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime dateCreated;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime dateUpdated;
    private RegisterOrganiserResponse organiser;
}
