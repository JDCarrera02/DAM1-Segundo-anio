package Ejercicio4;

import java.util.ArrayList;

public class PublicacionDemo {
    public static void main(String[] args) {
        ArrayList <Publicacion> listaPublicaciones = new ArrayList<>();

        listaPublicaciones.add(new Libro("Brave New World", "Aldous Huxley", 250));
        listaPublicaciones.add(new Revista("La 1 de uno", "La megaRadio", 12));

        for(Publicacion publicacion:listaPublicaciones) {
            System.out.println();
            System.out.println(publicacion.mostrarInformacion());
        }
    }
}