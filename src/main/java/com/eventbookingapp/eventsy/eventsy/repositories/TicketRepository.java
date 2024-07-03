package com.eventbookingapp.eventsy.eventsy.repositories;

import com.eventbookingapp.eventsy.eventsy.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
