package com.devhoss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devhoss.model.Ticket;

@Service
public interface ITicketsService {

	public List<Ticket> FindAll();
}
