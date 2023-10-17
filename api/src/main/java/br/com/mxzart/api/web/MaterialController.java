package br.com.mxzart.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mxzart.api.api.MaterialRequest;
import br.com.mxzart.api.domain.Material;
import br.com.mxzart.api.domain.MaterialRep;
import br.com.mxzart.api.domain.MaterialService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired

    private MaterialService materialService;
    
    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @PostMapping

    public ResponseEntity<Object> create(@RequestBody MaterialRequest request) {
       
        var material = materialService.create(request).map(MaterialMapper::formMaterialToResponse);

        return ResponseEntity.status(HttpStatus.CREATED).body(material);
        
    }
    @Autowired
    private MaterialRep materialRep;

    @GetMapping
    public Flux<Material> listarMaterial() {
        return (Flux<Material>) materialRep.findAll();
    }

    @PutMapping("/{id}")
    public Mono<Material> atualizarMaterial(@PathVariable Long id, @RequestBody Material material) {
        material.setId(id);
        return materialRep.save(material);
    }

    @DeleteMapping("/{id}")
    public void apagarMaterial(@PathVariable Long id) {
        materialRep.deleteById(id);
    }
}

