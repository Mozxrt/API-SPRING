package br.com.mxzart.api.api;

    import java.time.LocalDateTime;

public record ObraResponse (Long id, LocalDateTime dataIn, LocalDateTime dataFim, Double totalGasto){
    
}
