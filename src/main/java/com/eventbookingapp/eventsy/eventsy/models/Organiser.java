package com.eventbookingapp.eventsy.eventsy.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "organisers")
public class Organiser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long organizerId;
    @Column(unique = true)
    private String email;
    private String password;
    private String phoneNumber;




}
