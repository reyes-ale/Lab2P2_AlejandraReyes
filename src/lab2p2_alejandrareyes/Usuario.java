/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Usuario {
    String nombre;
    String contra;
    String tipousuario;

    public Usuario(String nombre, String contra, String tipousuario) {
        this.nombre = nombre;
        this.contra = contra;
        this.tipousuario = tipousuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }
    
    
}
