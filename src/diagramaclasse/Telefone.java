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
public class Telefone {
    private String numero;

   /** Método Construtor:
     * @param numero */
    public Telefone(String numero) {
        this.numero = numero;
    }

    
    /** Método Construtor Vazio */
    public Telefone() {
    }

    /** Get e Set :
     * @return  */
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    /** Equals e Hash:
     * @return  */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.numero);
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
        final Telefone other = (Telefone) obj;
        return Objects.equals(this.numero, other.numero);
    }
    
    
    
    
    
}
