package com.devhoss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devhoss.model.Ticket;

@Repository
public interface ITicketsRepository extends JpaRepository<Ticket, Long>{

}
