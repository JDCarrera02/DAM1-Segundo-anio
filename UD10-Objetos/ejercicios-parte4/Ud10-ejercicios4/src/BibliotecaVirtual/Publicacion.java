package BibliotecaVirtual;

import java.time.LocalDate;

/*
* La clase publicacion será la base donde tendra varias subclases que heredaran sus metodos y atributos
* Al tratarse de la clase Libro y Revista, tendrán un constructor específico para cada uno de sus instanciaciones
* Y la declaramos abstracta porque solamente queremos que se utilice lo esencial, que sería el constructor y el metodo
* mostrarInfo()
* */
public abstract class Publicacion {
    /*Declaramos los atributos en protected, para que puedan ser utilizados por las clases hijas
    * Todas son publicaciones, pero son diferentes objetos, tienen en comun los atributos que se han
    * creado*/
    protected String titulo, autor;
    protected LocalDate anioPublicacion;

    /*Constructor base para todos los que hereden de Publicacion*/
    public Publicacion(String titulo, String autor, LocalDate anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }


    public Publicacion() {
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(LocalDate anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getAnioPublicacion() {
        return anioPublicacion;
    }

    public abstract String mostrarInfo();

}