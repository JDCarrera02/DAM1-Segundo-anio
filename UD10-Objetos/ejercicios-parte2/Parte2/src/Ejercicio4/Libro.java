package Ejercicio4;

public class Libro extends Publicacion{
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()+"\n"+
                "Numero de paginas: " + numeroPaginas;
    }
}