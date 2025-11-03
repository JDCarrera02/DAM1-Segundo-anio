package Ejercicio1;

public class Perro extends Animal{

    public Perro(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro está ladrando");
    }
}
