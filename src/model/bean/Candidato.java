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
public class Candidato {
    private int cancodigo;
    private String cannome;
    private int cannumero;
    private Partido canpartido;

    public int getCancodigo() {
        return cancodigo;
    }

    public void setCancodigo(int cancodigo) {
        this.cancodigo = cancodigo;
    }

    public String getCannome() {
        return cannome;
    }

    public void setCannome(String cannome) {
        this.cannome = cannome;
    }

    public int getCannumero() {
        return cannumero;
    }

    public void setCannumero(int cannumero) {
        this.cannumero = cannumero;
    }

    public Partido getCanpartido() {
        return canpartido;
    }

    public void setCanpartido(Partido canpartido) {
        this.canpartido = canpartido;
    }

    
}
