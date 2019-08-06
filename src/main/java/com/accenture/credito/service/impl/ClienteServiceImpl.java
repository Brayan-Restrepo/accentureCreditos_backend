package com.accenture.credito.service.impl;

import java.util.Objects;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.credito.Exception.InvalidException;
import com.accenture.credito.model.dto.RegistroClienteDto;
import com.accenture.credito.model.entity.Cliente;
import com.accenture.credito.repository.ClienteRepository;
import com.accenture.credito.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	private ModelMapper modelMapper;

	public ClienteServiceImpl() {
		this.modelMapper = new ModelMapper();
	}

	@Override
	@Transactional
	public void registrarCliente(RegistroClienteDto clienteDto) throws InvalidException {
		if(Objects.nonNull(clienteDto)){
			if (this.clienteRepository.existsById(clienteDto.getIdentificacion()))
				throw new InvalidException("El cliente ya existe");
			
			Cliente cliente = this.modelMapper.map(clienteDto, Cliente.class);
			this.clienteRepository.save(cliente);	
		} else {
			throw new InvalidException("Datos no valido");
		}
	}

}
