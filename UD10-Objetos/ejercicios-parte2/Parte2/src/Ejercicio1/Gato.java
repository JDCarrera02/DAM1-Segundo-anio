package Ejercicio1;

public class Gato extends Animal{
    public Gato(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }
}
