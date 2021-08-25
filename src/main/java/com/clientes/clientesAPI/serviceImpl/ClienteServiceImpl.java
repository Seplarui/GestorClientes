package com.clientes.clientesAPI.serviceImpl;

import java.util.List;
import java.util.Optional;
import com.clientes.clientesAPI.entities.Cliente;
import com.clientes.clientesAPI.repository.ClienteRepository;
import com.clientes.clientesAPI.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAllClientes() {
        
        return clienteRepository.findAll();

    }

    @Override
    public Optional<Cliente> findClienteById(Long id) {
        
        Optional<Cliente> cliente = clienteRepository.findById(id);

        return cliente;
    }

    @Override
    public Cliente saveCliente(Cliente clienteNew) {
        if(clienteNew != null) {
            return clienteRepository.save(clienteNew);
        }
        return new Cliente();
    }

    @Override
    public String deleteCliente(Long id) {
        
        if(clienteRepository.findById(id).isPresent()) {
            clienteRepository.deleteById(id);
            return "Cliente eliminado.";
        } 

        return "Error: El cliente no se ha podido eliminar";

    }

    @Override
    public String updateCliente(Cliente clienteUpdate) {
        
        Long num = clienteUpdate.getId();

        if (clienteRepository.findById(num).isPresent()) {
            Cliente clienteToUpdate = new Cliente();
            clienteToUpdate.setId(clienteUpdate.getId());
            clienteToUpdate.setCif(clienteUpdate.getCif());
            clienteToUpdate.setContacto1(clienteUpdate.getContacto1());
            clienteToUpdate.setContacto2(clienteUpdate.getContacto2());
            clienteToUpdate.setDireccion(clienteUpdate.getDireccion());
            clienteToUpdate.setRazonsocial(clienteUpdate.getRazonsocial());
            clienteToUpdate.setTelefono1(clienteUpdate.getTelefono1());
            clienteToUpdate.setTelefono2(clienteUpdate.getTelefono2());

            clienteRepository.save(clienteToUpdate);
            return "Cliente Actualizado";
        }

        return "Error: El cliente no se ha podido actualizar.";

    }


    
}
