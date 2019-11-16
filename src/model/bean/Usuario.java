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
public class Usuario {
    private long usucodigo = 0;
    private String usulogin = null;
    private String ususenha =null;

    public Usuario() {
    }

    
    public Usuario(long usucodigo, String usulogin, String ususenha) {
        this.usucodigo = usucodigo;
        this.usulogin = usulogin;
        this.ususenha = ususenha;
    }
    
    

    public long getUsucodigo() {
        return usucodigo;
    }

    public void setUsucodigo(int usucodigo) {
        this.usucodigo = usucodigo;
    }

    public String getUsulogin() {
        return usulogin;
    }

    public void setUsulogin(String usulogin) {
        this.usulogin = usulogin;
    }

    public String getUsusenha() {
        return ususenha;
    }

    public void setUsusenha(String ususenha) {
        this.ususenha = ususenha;
    }

    
}
