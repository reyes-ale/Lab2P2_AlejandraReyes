/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Articulo {
    String titulo;
    String autor;
    String tema;
    String fecha;
    boolean acceso;

    public Articulo(String titulo, String autor, String tema, String fecha, boolean acceso) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fecha = fecha;
        this.acceso = acceso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return "Articulo{" + "titulo=" + titulo + ", autor=" + autor + ", tema=" + tema + ", fecha=" + fecha + ", acceso=" + acceso + '}';
    }
    
    
}
