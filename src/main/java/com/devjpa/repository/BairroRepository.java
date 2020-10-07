package com.devjpa.repository;

import com.devjpa.model.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hallef.bruno
 */
@Repository
public interface BairroRepository extends JpaRepository<Bairro, Long>{
    
}
