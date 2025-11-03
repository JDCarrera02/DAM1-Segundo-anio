package Ejer11;

import java.util.Scanner;

public class FactorialRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("No se admiten valores negativos");
            return;
        }
        System.out.print("Factorial de " + numero + "!= ");
        imprimirFactorial(numero);
        System.out.println(" = " + factorialNumero2(numero));
        sc.close();
    }

    static int factorialNumero2(int numero){
        if (numero == 1 || numero == 0){
            return 1;
        }
        return numero * factorialNumero2(numero - 1);
    }

    static void imprimirFactorial(int numero){
        if (numero == 1){
            System.out.print("1");
            return;
        }
        System.out.print(numero + " * ");
        imprimirFactorial(numero - 1);
    }
}