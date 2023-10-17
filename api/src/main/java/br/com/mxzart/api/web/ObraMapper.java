package br.com.mxzart.api.web;

import br.com.mxzart.api.api.ObraResponse;
import br.com.mxzart.api.domain.Obra;

public class ObraMapper {
    public static ObraResponse formObraToResponse(Obra obra) {
        return new ObraResponse(null, obra.dataIn(), obra.dataFim(), obra.totalGasto());
    }
}
