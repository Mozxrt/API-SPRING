package br.com.mxzart.api.domain;

import br.com.mxzart.api.api.MaterialRequest;
import reactor.core.publisher.Mono;

public class MaterialService {
    private MaterialRep materialRep;

    public MaterialService(MaterialRep materialRep){
        this.materialRep = materialRep;
    }

    public Mono<Material> create(MaterialRequest materialRequest){
        var material = new Material(null, materialRequest.descrição(), materialRequest.preco());
        return materialRep.save(material);
    }


}
