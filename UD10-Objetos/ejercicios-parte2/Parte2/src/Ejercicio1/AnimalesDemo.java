package Ejercicio1;

public class AnimalesDemo {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Lucas", "Perro");
        Animal gato1 = new Gato("Felix", "Gato");

        perro1.hacerSonido();

        gato1.hacerSonido();
    }
}
