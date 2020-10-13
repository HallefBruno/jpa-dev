
package com.devjpa.controller;

import com.devjpa.model.Bairro;
import com.devjpa.service.BairroService;
import com.devjpa.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hallef.bruno
 */
@Controller
@RequestMapping("bairros")
public class BairroController {
    
    @Autowired
    private BairroService bairroService;
    
    @Autowired
    private CidadeService cidadeService;

    @PostMapping("salvar")
    public ResponseEntity<?> salvar(@RequestBody Bairro bairro) {
        return ResponseEntity.ok(bairroService.salvar(bairro));
    }
    
    @GetMapping("cidades/todas")
    public ResponseEntity<?> todasCidades() {
        return ResponseEntity.ok(cidadeService.todas());
    }
    
}
