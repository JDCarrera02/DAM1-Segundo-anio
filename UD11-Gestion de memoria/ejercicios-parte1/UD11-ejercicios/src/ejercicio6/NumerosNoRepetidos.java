package ejercicio6;

import java.util.*;

public class NumerosNoRepetidos {
    public static void main(String[] args) {
        // Lista principal donde se guardaran los numero generados
        List <Integer> listaNumeros = new ArrayList<>();
        Random numR = new Random();
        for (int i = 0; i < 30; i++){
            int numero = numR.nextInt(0,99); // Numeros entre el 0 y 99
            listaNumeros.add(numero);
            System.out.print(numero+" "); // imprimir los numeros generados
        }
        // Utilizamos un HashSet para eliminar los elementos repetidos
        System.out.println();
        System.out.println("Lista no repetidos: ");
        Set<Integer>listaNoRepetidos = new HashSet<>(listaNumeros);

        for (Integer i : listaNoRepetidos){
            System.out.print(i+" ");
        }
    }
}