package br.com.mxzart.api.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public record Obra(Long id , Double totalGasto, @CreatedDate LocalDateTime dataIn, @LastModifiedDate LocalDateTime dataFim) {


    
}
