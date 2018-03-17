/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

/**
 *
 * @author Gonzalo
 */
public class Cafe {

    private Integer azucar;
    private String tipo;

    public Cafe() {
    }

    public Cafe(Integer azucar, String tipo) {
        this.azucar = azucar;
        this.tipo = tipo;
    }

    public Integer getAzucar() {
        return azucar;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setAzucar(Integer azucar) {
        this.azucar = azucar;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}