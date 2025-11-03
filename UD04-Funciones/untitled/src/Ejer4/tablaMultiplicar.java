package Ejer4;

import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("Tabla del " + numero + " : ");
        escribirTablaMultiplicar(numero);
    }
    public static void escribirTablaMultiplicar(int numero){
        for (int i = 1; i <= 10 ; i++){
            System.out.println(numero + " * " + i + " = " + numero*i);
        }
    }
}