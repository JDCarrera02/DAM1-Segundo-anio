package Ejer6;

import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        int a = sc.nextInt();
        System.out.println("Digita otro numero: ");
        int b = sc.nextInt();
        System.out.println("Media aritmetica: ");
        System.out.println(mediaDosNumeros(a,b));

    }

    public static double mediaDosNumeros(int num1, int num2){
        return (double)(num1+num2)/2;
    }
}
