package com.accenture.credito.service;

import com.accenture.credito.Exception.InvalidException;
import com.accenture.credito.model.dto.RegistroClienteDto;

public interface ClienteService {
	
	public void registrarCliente(RegistroClienteDto clienteDto) throws InvalidException;
	
}
