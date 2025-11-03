/*
 * Realiza un programa que pida introducir un número entero por la consola.
Después deberá mostrar los divisores enteros del número.
 */

import java.util.Scanner;
public class ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digita un numero: ");
        num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                System.out.print(i+" ");
            }    
        }
        sc.close();        
    }
}