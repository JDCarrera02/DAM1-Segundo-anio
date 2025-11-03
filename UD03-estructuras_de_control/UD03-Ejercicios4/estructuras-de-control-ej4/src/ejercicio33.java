import java.util.Scanner;

/*
 * Realiza un programa que pida introducir un número entero por la consola.
   Después deberá mostrar la descomposición del número en factores primos.
 * Ejemplo:
    24 | 2
    12 | 2
    6 | 2
    3 | 3
    1
 */
public class ejercicio33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int n = sc.nextInt();

        int divisor = 2;

        while (n > 1){
            if (n % divisor == 0) {
                System.out.println(n + " | " + divisor);
                n = n/divisor;

            } else {
                divisor++;
            }
        }

        System.out.println("1");
        sc.close();
    }
}