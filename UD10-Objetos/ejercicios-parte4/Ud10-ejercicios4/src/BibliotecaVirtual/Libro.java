package BibliotecaVirtual;

import java.time.LocalDate;

public class Libro extends Publicacion{

    public Libro(String titulo, String autor, LocalDate anioPublicacion) {
        super.titulo = titulo;
        super.autor = autor;
        super.anioPublicacion = anioPublicacion;
    }

    public Libro() {
    }

    @Override
    public String mostrarInfo() {
        return "Titulo del libro: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Año de publicacion: " + anioPublicacion;
    }
}