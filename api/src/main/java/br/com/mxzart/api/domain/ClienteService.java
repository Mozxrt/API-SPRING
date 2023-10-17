package br.com.mxzart.api.domain;

import br.com.mxzart.api.api.ClienteRequest;
import reactor.core.publisher.Mono;

public class ClienteService {
        private ClienteRep clienteRep;

    public ClienteService(ClienteRep clienteRep){
        this.clienteRep = clienteRep;
    }

    public Mono<Cliente> create(ClienteRequest clienteRequest){
        var cliente = new Cliente(null, clienteRequest.nome(), clienteRequest.slug(),
        clienteRequest.state());
        return clienteRep.save(cliente);
}
}
