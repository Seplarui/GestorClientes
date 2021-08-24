package com.clientes.repository;

import java.util.Optional;

import com.clientes.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<Cliente, Long> {
    Void save(Optional<Cliente> clienteToUpdate);
    
}
