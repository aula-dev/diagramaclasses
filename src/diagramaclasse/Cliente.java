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
public class Cliente {
    private Integer id;
    private String nome;
    private Integer idade;
    private Sexo sexo;
    
    private Telefone[] telefones;
    
    private Endereco endereco;

    
    /**Método Construtor
     * @param id
     * @param nome
     * @param idade
     * @param sexo
     * @param telefones
     * @param endereco */
    public Cliente(Integer id, String nome, Integer idade, Sexo sexo, Telefone[] telefones, Endereco endereco) {    
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefones = telefones;
        this.endereco = endereco;
    }

    
    
    /** Método Construtor Vazio */
    public Cliente() {
    }

    
    
    
    /** Getters e Setters:
     * @return  */
    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.idade);
        hash = 59 * hash + Objects.hashCode(this.sexo);
        return hash;
    }

    
    /**Equals e Hash
     * @param obj
     * @return  */
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        return this.sexo == other.sexo;
    }
    
    
    
    
    
    
}
