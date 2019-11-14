/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Ramonbr14
 */
public class Urna {
    private int urncodigo;
    private String urndatahora;
    private int urnvoto;
    private Candidato canditado;
    private Eleitor eleitor;

    public int getUrncodigo() {
        return urncodigo;
    }

    public void setUrncodigo(int urncodigo) {
        this.urncodigo = urncodigo;
    }

    public String getUrndatahora() {
        return urndatahora;
    }

    public void setUrndatahora(String urndatahora) {
        this.urndatahora = urndatahora;
    }

    public int getUrnvoto() {
        return urnvoto;
    }

    public void setUrnvoto(int urnvoto) {
        this.urnvoto = urnvoto;
    }

    public Candidato getCanditado() {
        return canditado;
    }

    public void setCanditado(Candidato canditado) {
        this.canditado = canditado;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }

    
    
    
}
