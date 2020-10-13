
package com.devjpa.controller;

import com.devjpa.model.Cidade;
import com.devjpa.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hallef.bruno
 */
@RestController
@RequestMapping("cidades")
public class CidadeController {
    
    @Autowired
    private CidadeService cidadeService;
    
    @PostMapping("salvar")
    public ResponseEntity<Cidade> salvar(@RequestBody Cidade cidade) {
        return ResponseEntity.ok(cidadeService.salvar(cidade));
    }
    
}
