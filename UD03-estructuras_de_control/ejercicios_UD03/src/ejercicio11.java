/*  Crea un programa que pida al usuario 2 números enteros y calcule la división
    de ambos restado al primer número el segundo de manera sucesiva. Por
    ejemplo: 7, 3 → 7 - 3 = 4, 4 – 3 = 1, como 1 es menor que 3 no puedo seguir.
    La división igual a 2 que es el número de veces que se ha podido realizar la
    resta.
 */
import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int resta = num1;
        do {
            resta -= num2;             
        } while (resta > num2);
        System.out.println(resta);
        sc.close();
    }
    
}
