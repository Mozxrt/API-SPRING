package br.com.mxzart.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import br.com.mxzart.api.domain.MaterialRep;
import br.com.mxzart.api.domain.MaterialService;

@Configuration
@EnableR2dbcAuditing
public class MaterialConfig {
    
    @Bean
    MaterialService materialService(MaterialRep materialRep){
        return new MaterialService(materialRep);
    }

}
