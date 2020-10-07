
package com.devjpa.repository;

import com.devjpa.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hallef.bruno
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{
    
}
