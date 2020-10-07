
package com.devjpa.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author hallef.bruno
 */
@Data
@Entity
public class Cidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    @JoinColumn(name = "id_estado")
    @ManyToOne
    private Estado estado;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cidade")
    private List<Bairro> bairros;
    
}
