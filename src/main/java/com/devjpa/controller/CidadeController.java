
package com.devjpa.controller;

import com.devjpa.model.Cidade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hallef.bruno
 */
@RestController
@RequestMapping("cidades")
public class CidadeController {
    
    @GetMapping
    public ModelAndView modelAndView() {
        return new ModelAndView("Cidade");
    }
    
    @PostMapping("salvar")
    public ResponseEntity<Cidade> salvar(@RequestBody Cidade cidade) {
        return null;
    }
    
}
