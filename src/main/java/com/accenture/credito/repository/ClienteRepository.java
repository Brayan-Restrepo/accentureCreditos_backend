package com.accenture.credito.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.credito.model.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
