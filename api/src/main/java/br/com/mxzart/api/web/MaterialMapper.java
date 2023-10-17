package br.com.mxzart.api.web;

import br.com.mxzart.api.api.MaterialResponse;
import br.com.mxzart.api.domain.Material;

public class MaterialMapper {
    public static MaterialResponse formMaterialToResponse(Material material) {
        return new MaterialResponse(material.descrição(), material.preco());
    }
}
