package com.clientes.clientesAPI.controllers;

import java.util.List;
import java.util.Optional;

import com.clientes.clientesAPI.entities.Cliente;

public interface ClienteController {

    public List<Cliente> getClientes();
    public Optional<Cliente> getClienteById(Long id);
    public Cliente addCliente(Cliente cliente);
    public String deleteCliente(Long id);
    public String updateCliente(Cliente clienteNew);
    
    
}
