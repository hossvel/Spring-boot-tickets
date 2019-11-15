package com.devhoss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devhoss.model.Ticket;
import com.devhoss.repository.ITicketsRepository;

@Service
public class TicketsServiceImpl implements ITicketsService {

	@Autowired
	private ITicketsRepository iTicketsRepository;


	public List<Ticket> FindAll() {
		return iTicketsRepository.findAll();
	}
	
}

