package Ejercicio4;

public abstract class Publicacion {
    private String titulo;
    private String autor;

    public Publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String mostrarInformacion(){
        return "Titulo: " + titulo + "\n" +
                "Autor: " + autor;
    }
}