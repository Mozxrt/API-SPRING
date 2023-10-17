package br.com.mxzart.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mxzart.api.api.ObraResquest.ObraRequest;
import br.com.mxzart.api.domain.ObraService;

  @RestController
@RequestMapping("/obra")

public class ObraController {
 
    @Autowired

    private ObraService obraService;
    Object obra;
    
    public ObraController(ObraService obraService) {
        this.obraService = obraService;
    }

    @PostMapping

    public ResponseEntity<Object> create(@RequestBody ObraRequest request) {
       
        var obra = obraService.create(request).map(ObraMapper::formObraToResponse);

        return ResponseEntity.status(HttpStatus.CREATED).body(obra);
        
    }

}
