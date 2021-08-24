package com.clientes.service;

import java.util.List;
import java.util.Optional;
import com.clientes.entities.Cliente;

public interface ClienteService {

    public List<Cliente> findAllClientes();
    public Optional<Cliente> findClienteById(Long id);
    public Cliente saveCliente(Cliente clienteNew);
    public String updateCliente(Cliente clienteNew);
    public String deleteCliente(Long id);
    
    
}
