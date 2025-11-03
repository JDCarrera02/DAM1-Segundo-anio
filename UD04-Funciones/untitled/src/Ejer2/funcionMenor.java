package Ejer2;

import java.util.Scanner;

public class funcionMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        while (true){
            System.out.println("Digita un numero");
            if (sc.hasNextInt()){
                numero1 = sc.nextInt();
                System.out.println("Digita otro numero");
                if (sc.hasNextInt()){
                    numero2 = sc.nextInt();
                    System.out.println("Numero menor: " + menorDosNumeros(numero1,numero2));
                    break;
                }
            }
            System.out.println("No es un formato valido");
            sc.nextLine();
        }
    }

    public static int menorDosNumeros(int num1, int num2){
        return Math.min(num1,num2);
    }
}