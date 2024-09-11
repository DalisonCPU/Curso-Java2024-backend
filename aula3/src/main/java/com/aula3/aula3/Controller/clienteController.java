package com.aula3.aula3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula3.aula3.Model.Cliente;
import com.aula3.aula3.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class clienteController {
@Autowired
private ClienteService clienteService;
@GetMapping
public List<Cliente> getAllClientes() {
return clienteService.getAllClientes();
}
@PostMapping
public Cliente createCliente(@RequestBody 
Cliente cliente) {
return clienteService.saveCliente(cliente);
}
}