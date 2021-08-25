package com.clientes.clientesAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.clientes.clientesAPI.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    void save(Optional<Cliente> clienteToUpdate);
    
}
