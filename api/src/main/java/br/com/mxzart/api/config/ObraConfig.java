package br.com.mxzart.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.mxzart.api.domain.ObraRep;
import br.com.mxzart.api.domain.ObraService;

     @Configuration
public class ObraConfig {    
   @Bean
    br.com.mxzart.api.domain.ObraService ObraService(ObraRep obraRep){
        return new ObraService(obraRep);
    }
}


