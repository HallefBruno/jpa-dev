
package com.devjpa.service;

import com.devjpa.model.Bairro;
import com.devjpa.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hallef.bruno
 */
@Service
public class BairroService {
    
    @Autowired
    private BairroRepository bairroRepository;
    
    @Transactional
    public Bairro salvar(Bairro bairro) {
        Bairro bairroSalvo = bairroRepository.save(bairro);
        return bairroSalvo;
    }
    
}
