package CalculadoraSegura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita dos numeros para realizar las operaciones: suma, resta, multiplicacion y division ");
        double a;
        double b;

        while (true){
            try{
                System.out.print("Numero 1: ");
                a = sc.nextDouble();
                System.out.println("Numero 2: ");
                b = sc.nextDouble();

                System.out.println("Resultado de la suma: "+hacerSuma(a,b));
                System.out.println("Resultado de la resta: "+hacerResta(a,b));
                System.out.println("Resultado de la multiplicacion: "+hacerMultiplicacion(a,b));
                if (b == 0){
                    throw new ArithmeticException("No se puede dividir entre cero");
                } else {
                    System.out.println("Resultado de la division: " + hacerDivision(a,b));
                    break;
                }
            } catch (InputMismatchException exception){
                System.out.println("No es un formato valido, intentelo nuevamente");
                sc.nextLine();
            }
        }
    }

    public static int hacerSuma(double num1, double num2) {
        return (int) (num1 + num2);

    }

    public static int hacerResta(double num1, double num2) {
        return (int) (num1 - num2);
    }

    public static int hacerMultiplicacion(double num1, double num2) {
        return (int) (num1 * num2);
    }

    public static double hacerDivision(double num1, double num2) {
        return num1/num2;
    }
}