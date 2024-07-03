package com.eventbookingapp.eventsy.eventsy.repositories;

import com.eventbookingapp.eventsy.eventsy.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
