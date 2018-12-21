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
public class Endereco {
    private Integer id;
    private String logradouro;
    private String numero;
    private String bairro;

    /** Método Cosntrutor
     * @param id
     * @param logradouro
     * @param numero
     * @param bairro */
    
    public Endereco(Integer id, String logradouro, String numero, String bairro) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

    /** Método  Constutor Vazio */
    public Endereco() {
    }

    
    /** Getters e Setters
     * @return  */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    /**Equals e Hash
     * @return  */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.logradouro);
        hash = 29 * hash + Objects.hashCode(this.numero);
        hash = 29 * hash + Objects.hashCode(this.bairro);
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
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
    
    
}
