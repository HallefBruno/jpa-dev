
package com.devjpa.repository;

import com.devjpa.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hallef.bruno
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    
}
