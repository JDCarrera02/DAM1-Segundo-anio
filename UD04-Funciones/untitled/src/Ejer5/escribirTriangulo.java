package Ejer5;

import java.util.Scanner;

public class escribirTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = 'J';
        System.out.println("Digita el tamaño del triangulo: ");
        int tamanio = sc.nextInt();
        triangulo(letra,tamanio);
    }

    public static void triangulo(char letra, int tamanio){
        if (tamanio < 0 || tamanio == 0){
            System.out.println("No se admiten valores negativos ni el cero");

        } else if (tamanio == 1) {
            System.out.println(letra);
        }
        for (int i = 0 ; i < tamanio; i++){
            for (int j = i+1; j<tamanio;j++){
                System.out.print(letra);
            }
            System.out.println(letra);
        }
    }
}