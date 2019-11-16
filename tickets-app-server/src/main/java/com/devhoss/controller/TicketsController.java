package com.devhoss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devhoss.model.Ticket;
import com.devhoss.service.ITicketsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("v1/tickets")
@Api(value="Tickets", description="Operaciones con Tickets")
public class TicketsController {

	@Autowired
	private ITicketsService iTicketsService;

	@ApiOperation(value = "obtiene la lista de Tickets ingresados")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "se obtuvo la lista correctamente"),
			@ApiResponse(code = 401, message = "acceso no Autorizado"),
			@ApiResponse(code = 404, message = "no se encontro el recurso buscado")
	})

	@RequestMapping(value = "/findall", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Ticket>> findall() {
		return ResponseEntity.ok(iTicketsService.FindAll());
	}

	@RequestMapping(value = "/crearticket", method = RequestMethod.POST, produces = "application/json")
	@ApiOperation(value = "registrar ticket")
	public ResponseEntity<Ticket> create(@RequestBody Ticket ticket) {
		Ticket savedTicket = iTicketsService.Save(ticket);
		return new ResponseEntity<>(savedTicket,HttpStatus.CREATED);
	}

}
