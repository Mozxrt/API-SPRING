package br.com.mxzart.api.domain;


import br.com.mxzart.api.api.ObraResquest.ObraRequest;
import reactor.core.publisher.Mono;

public class ObraService {
        private ObraRep obraRep;

    public ObraService(ObraRep obraRep){
        this.obraRep = obraRep;
    }

    public Mono<Obra> create(ObraRequest obraRequest){
        var obra = new Obra( null, obraRequest.totalGasto(), obraRequest.dataFim(), obraRequest.dataIn());
        return obraRep.save(obra);
    }

}
