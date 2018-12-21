/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramaclasse;

import java.util.Objects;

/**
 *
 * @author Mariana
 */
public class Cidade {
    
    private Integer id;
    private String nome;

    /**Método Construtor:
     * @param id
     * @param nome */
    public Cidade(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**Construtor vazio: */
    public Cidade() {
    }

   
  /** get e set de cada atributo
     * @return  */ 
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
  /** Equals e hash
     * @return  */  
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
}
