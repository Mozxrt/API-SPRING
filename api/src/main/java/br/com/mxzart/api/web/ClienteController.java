package br.com.mxzart.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mxzart.api.api.ClienteRequest;
import br.com.mxzart.api.domain.Cliente;
import br.com.mxzart.api.domain.ClienteRep;
import br.com.mxzart.api.domain.ClienteService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired

    private ClienteService clienteService;
    Object cliente;

    @PostMapping

    public ResponseEntity<Object> create(@RequestBody ClienteRequest request) {
       
        var cliente = clienteService.create(request).map(ClienteMapper::formClienteToResponse);

        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
        
    }
    @Autowired
    private ClienteRep clienteRep;
    @GetMapping
    public Flux<Cliente> listarCliente() {
        return (Flux<Cliente>) clienteRep.findAll();
    }

    @PutMapping("/{id}")
    public Mono<Cliente> atualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteRep.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void apagarCliente(@PathVariable Long id) {
        clienteRep.deleteById(id);
    }
}
