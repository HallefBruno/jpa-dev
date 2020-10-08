
package com.devjpa.service;

import com.devjpa.model.Cidade;
import com.devjpa.repository.CidadeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author hallef.bruno
 */
@Service
public class CidadeService {
    
    @Autowired
    private CidadeRepository cidadeRepository;

    @Transactional
    public Cidade salvar(Cidade cidade) {
        Cidade cidadeSalva = cidadeRepository.save(cidade);
        return cidadeSalva;
    }
    
    public List<Cidade> todas() {
        return cidadeRepository.findAll();
    }
    
}
