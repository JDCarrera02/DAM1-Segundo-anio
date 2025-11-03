package ejercicio2;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random numR = new Random();
        for (int i = 0 ; i < 3 ; i++){
            int numero = numR.nextInt(0,9);
            System.out.print(numero+" ");
        }
    }
}