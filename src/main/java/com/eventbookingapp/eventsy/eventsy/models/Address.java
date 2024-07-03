package com.eventbookingapp.eventsy.eventsy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "address")
public class Address {
    @Id
    private Long addressId;
    private String houseNo;
    private String streetName;
    private String city;
    private String country;
}
