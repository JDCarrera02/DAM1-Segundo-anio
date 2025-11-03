package Ejer8;

import java.util.Scanner;

public class CalcularMayorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Primera implementacion:
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Primera implementacion: ");
        System.out.println(mayorDosNumeros(num1, num2));
        // Segunda implementacion:
        double num1Imp2 = sc.nextDouble();
        double num2Imp2 = sc.nextDouble();
        System.out.println("Segunda implementacion: ");
        System.out.println(mayorDosNumeros2(num1Imp2,num2Imp2));
    }

    public static int mayorDosNumeros(int num1, int num2){
        return Math.max(num1,num2);
    }

    public static double mayorDosNumeros2(double num1, double num2){
        return Math.max(num1,num2);
    }
}