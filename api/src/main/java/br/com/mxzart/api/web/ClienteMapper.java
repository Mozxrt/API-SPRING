package br.com.mxzart.api.web;

import br.com.mxzart.api.api.ClienteResponse;
import br.com.mxzart.api.domain.Cliente;

public class ClienteMapper {
    public static ClienteResponse formClienteToResponse(Cliente cliente) {
        return new ClienteResponse(cliente.nome(),cliente.slug(),cliente.state());
    }
}
