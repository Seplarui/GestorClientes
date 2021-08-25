package com.clientes.clientesAPI.service;

import java.util.List;
import java.util.Optional;
import com.clientes.clientesAPI.entities.Cliente;

public interface ClienteService {

    public List<Cliente> findAllClientes();
    public Optional<Cliente> findClienteById();
    public Cliente saveCliente(Cliente clienteNew);
    public String deleteCliente(Long id);
    public String updateCliente(Cliente clienteUpdate);
    
}
