package ejemplosApp;

import java.util.Arrays;
import java.util.List;

public class listaNumeros {
    public static void main(String[] args) {
        int [] numeros = {2, 3, 5, 9, 4};
        int [] numerosMayores = dosMayores(numeros);

        System.out.println("Numeros mayores: ");
        for (int i: numerosMayores){
            System.out.print(i + " ");
        }
    }

    public static int[] dosMayores(int[]array){
        int[]numerosMayores = new int[2]; // Inicializar el array de retorno con dimension de dos

        int numeroMayor = Arrays.stream(array).max().getAsInt(); // Obtener el numero mayor del array

        numerosMayores[0] = numeroMayor; // Primer elemento del array

        int numeroSegundoMayor = Arrays.stream(array).min().getAsInt(); // Obtener el valor menor posible dentro del array

        // Ordenar el array con el numero mayor en el primer indice
        for (int num : array){
            if (num != numeroMayor && num > numeroSegundoMayor){ // Si el numero del array es diferente y mayor al minimo, se sobreescribe el valor de segundoMayor
                numeroSegundoMayor = num;
            }
        }

        numerosMayores[1] = numeroSegundoMayor; // Meter el valor obtenido

        return numerosMayores; // Retornar los valores mayores del arreglo original
    }
}
