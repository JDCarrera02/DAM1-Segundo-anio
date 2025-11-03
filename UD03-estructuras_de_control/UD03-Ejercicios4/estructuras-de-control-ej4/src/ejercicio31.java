import java.util.Random;

/*
 *31. Realiza un programa que genere y muestre por pantalla 10 números
aleatorios entre 1 y 100. Después el programa debe mostrar el número
máximo y mínimo de la serie. 
 * 
 */
public class ejercicio31 {
    public static void main(String[] args) {

        Random numRandom = new Random();

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            int num = numRandom.nextInt(0,101);
            System.out.print(num+" ");

            if (num > maximo) {
                maximo = num;
            }

            if (num < minimo){
                minimo = num;
            }
        }

        System.out.println();

        System.out.println("Numero Minimo: " + minimo);
        System.out.println("Numero Maximo: " + maximo);

    }
}
