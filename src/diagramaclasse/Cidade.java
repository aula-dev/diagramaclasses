/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramaclasse;

import java.util.Objects;

/**
 *
 * @author Pedro
 */
public class Cidade {
    
    private Integer id;
    private String nome;
    
    // Segundo o diagrama de classes não há esta referência para a classe Endereco.
    private Endereco endereco;
    
    private Estado estado;

    /**Método Construtor:
     * @param id
     * @param nome
     * @param endereco
     * @param estado */
    public Cidade(Integer id, String nome, Endereco endereco, Estado estado) {   
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
    }

    /**Construtor vazio: */
    public Cidade() {
    }

    
    /** Getters e Setters
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /** Equals e hash
     * @return  */ 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.endereco);
        hash = 97 * hash + Objects.hashCode(this.estado);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return Objects.equals(this.estado, other.estado);
    }
    
    
}
