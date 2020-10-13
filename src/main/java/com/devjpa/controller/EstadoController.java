
package com.devjpa.controller;

import com.devjpa.model.Estado;
import com.devjpa.service.EstadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hallef.bruno
 */
@RestController
@RequestMapping("estados")
public class EstadoController {
    
    @Autowired
    private EstadoService estadoService;
    
    @PostMapping("salvar")
    public ResponseEntity<?> salvar(@RequestBody Estado estado) {
        Estado estadoSalvo = estadoService.salvar(estado);
        return ResponseEntity.ok(estadoSalvo);
    }
    
    @GetMapping("todos")
    public List<Estado> todos() {
        return estadoService.todos();
    }
    
}
