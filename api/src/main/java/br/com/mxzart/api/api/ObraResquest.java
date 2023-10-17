package br.com.mxzart.api.api;

import java.time.LocalDateTime;

public class ObraResquest {
    public record ObraRequest (Long id, LocalDateTime dataIn, LocalDateTime dataFim, Double totalGasto){

    public LocalDateTime dataIn() {
        return null;
    }

    public LocalDateTime dataFim() {
        return null;
    }
}
}
