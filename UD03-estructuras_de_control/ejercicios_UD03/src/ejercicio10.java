/**
 *  Crea un programa que pida al usuario 2 números enteros y calcule la
    multiplicación de ambos aplicando sumas sucesivas del primer número tantas
    veces como valga el segundo. Por ejemplo: 2, 3 → 2 * 3 = 2 + 2 + 2 (3 veces).
 */
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos los numeros al usuario:
        int num1 = sc.nextInt();
        //numero de veces que el numero anterior se va a sumar asi mismo
        int numSuma = sc.nextInt();
        int sumador = 0;
        //Realizamos el bucle for para iterar por lo que indique nSuma, y en cada iteracion ir sumando el mismo numero
        //Con la ayuda de la variable sumador que será un acumulador que con cada iteracion realizará la suma:
        for (int i = 0; i < numSuma; i++) {
            sumador += num1;      
        }
        //Mostramos por consola el numero digitado y su respectiva suma
        System.out.println("La suma de " + num1 + " es: " + sumador);
        //Cerramos el scanner para que no consuma recursos
        sc.close();    
    }

}