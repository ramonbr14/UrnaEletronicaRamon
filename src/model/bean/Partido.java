/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Date;

/**
 *
 * @author Ramonbr14
 */
public class Partido {
    private int parcodigo;
    private String parnome;
    private Date parfundacao;
    private String pardescricao;

    public Partido() {
    }
    
    public Partido(int parcodigo, String parnome, Date parfundacao, String pardescricao) {
        this.parcodigo = parcodigo;
        this.parnome = parnome;
        this.parfundacao = parfundacao;
        this.pardescricao = pardescricao;
    }
    
    
    
    

    public int getParcodigo() {
        return parcodigo;
    }

    public void setParcodigo(int parcodigo) {
        this.parcodigo = parcodigo;
    }

    public String getParnome() {
        return parnome;
    }

    public void setParnome(String parnome) {
        this.parnome = parnome;
    }

    public Date getParfundacao() {
        return parfundacao;
    }

    public void setParfundacao(Date parfundacao) {
        this.parfundacao = parfundacao;
    }

    public String getPardescricao() {
        return pardescricao;
    }

    public void setPardescricao(String pardescricao) {
        this.pardescricao = pardescricao;
    }

    
}
