
package com.devjpa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author hallef.bruno
 */
@Data
@Entity
public class Estado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    @OnDelete(action = OnDeleteAction.CASCADE)
    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades;
    
}
