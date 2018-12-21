/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramaclasse;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Pedro
 */
public class Estado {
  private Integer id;
  private String nome;
  
  private Cidade[] cidades;

  /**Método Construtor:
     * @param id
     * @param nome
     * @param cidades */
    public Estado(Integer id, String nome, Cidade[] cidades) {
        this.id = id;
        this.nome = nome;
        this.cidades = cidades;
    }

    /** Método Construtor Vazio */
    public Estado() {
    }

    
    /** Getters e Setters:
     * @return  */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade[] getCidades() {
        return cidades;
    }

    public void setCidades(Cidade[] cidades) {
        this.cidades = cidades;
    }

    
    
    /** Equals e Hash:
     * @return  */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Arrays.deepHashCode(this.cidades);
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
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Arrays.deepEquals(this.cidades, other.cidades);
    }
    
    
}
