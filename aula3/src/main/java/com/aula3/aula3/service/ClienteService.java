package com.aula3.aula3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aula3.aula3.Model.Cliente;
import com.aula3.aula3.Repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente getClienteById(int id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    @Transactional // Garantir que a transação seja executada corretamente
    public Cliente saveCliente(Cliente cliente) {
        System.out.println("Salvando cliente: " + cliente.getNome());
        Cliente savedCliente = clienteRepository.save(cliente);
        System.out.println("Cliente salvo com ID: " + savedCliente.getId());
        return savedCliente;
    }

    @Transactional // Garantir transação para atualizações também
    public Cliente updateCliente(int id, Cliente updatedCliente) {
        Optional<Cliente> existingCliente = clienteRepository.findById(id);
        if (existingCliente.isPresent()) {
            Cliente cliente = existingCliente.get();
            cliente.setNome(updatedCliente.getNome());
            cliente.setCpf(updatedCliente.getCpf());
            cliente.setProfissao(updatedCliente.getProfissao());
            return clienteRepository.save(cliente);
        }
        return null;
    }

    @Transactional // Para a remoção também garantir transação
    public boolean deleteCliente(int id) {
        Optional<Cliente> existingCliente = clienteRepository.findById(id);
        if (existingCliente.isPresent()) {
            clienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}