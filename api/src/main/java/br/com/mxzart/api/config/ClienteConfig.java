package br.com.mxzart.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.mxzart.api.domain.ClienteRep;
import br.com.mxzart.api.domain.ClienteService;

 @Configuration
public class ClienteConfig {
    
   @Bean
    ClienteService clienteService(ClienteRep clienteRep){
        return new ClienteService(clienteRep);
    }
}
