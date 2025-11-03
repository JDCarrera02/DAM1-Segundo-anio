package BibliotecaVirtual;

import java.time.LocalDate;

public class Revista extends Publicacion{

    public Revista(String titulo, String autor, LocalDate anioPublicacion) {
        super.titulo = titulo;
        super.autor = autor;
        super.anioPublicacion = anioPublicacion;
    }

    public Revista() {
    }

    @Override
    public String mostrarInfo() {
        return "Nombre de la revista: "+ titulo + "\n" +
                "Autor de la revista: "+ autor + "\n" +
                "Año de publicacion: " + anioPublicacion;
    }
}