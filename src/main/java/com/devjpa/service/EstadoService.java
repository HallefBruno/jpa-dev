
package com.devjpa.service;

import com.devjpa.model.Estado;
import com.devjpa.repository.EstadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hallef.bruno
 */
@Service
public class EstadoService {
    
    @Autowired
    private EstadoRepository estadoRepository;
    
    
    @Transactional
    public Estado salvar(Estado estado) {
        Estado estadoSalvo = estadoRepository.save(estado);
        return estadoSalvo;
    }
    
    public List<Estado> todos() {
        return estadoRepository.findAll();
    }
}
