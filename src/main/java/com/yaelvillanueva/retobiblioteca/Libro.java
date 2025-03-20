package com.yaelvillanueva.retobiblioteca;

/**
 *
 * @author YAEL
 */
public class Libro {

    private String titulo, autor, id;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
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

  
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor;
    }
}
