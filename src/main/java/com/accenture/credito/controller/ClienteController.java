package com.accenture.credito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.credito.Exception.InvalidException;
import com.accenture.credito.model.dto.RegistroClienteDto;
import com.accenture.credito.service.ClienteService;
import com.accenture.credito.util.EndpointUtil;

@RestController
@RequestMapping(EndpointUtil.URL_API + EndpointUtil.REGISTRO)
@CrossOrigin(value = "*")
public class ClienteController {


	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(EndpointUtil.CLIENTE) 
	public void saveCliente(@RequestBody RegistroClienteDto registroClienteDto) throws InvalidException{
		this.clienteService.registrarCliente(registroClienteDto);
	}
	
}
