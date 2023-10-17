package br.com.mxzart.api.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MaterialRep extends ReactiveCrudRepository<Material, Long>{
    
}
