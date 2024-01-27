/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Libro {
    String titulo;
    String autor;
    String genero;
    String anio;
    boolean dispo;

    public Libro(String titulo, String autor, String genero, String anio, boolean dispo) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
        this.dispo = dispo;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public boolean getDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    @Override
    public String toString() {
        return "Libro {" + "titulo: " + titulo + " | autor: " + autor + " | genero: " + genero + " | año: " + anio + " | disponibilidad: " + dispo + '}';
    }

    
    
    
}
