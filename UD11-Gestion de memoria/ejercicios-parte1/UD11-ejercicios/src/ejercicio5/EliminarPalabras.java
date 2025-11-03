package ejercicio5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EliminarPalabras {
    public static void main(String[] args) {
        List<String> listaPalabras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numPalabras;
        String palabra;
        do {
            try {
                System.out.println("¿Cuantas palabras desea añadir?");
                numPalabras = sc.nextInt();
                sc.nextLine();
                if (numPalabras < 0){
                    System.out.println("No se admiten valores negativos");
                } else {
                    System.out.println("Escribe las palabras: ");
                    for (int i = 0; i < numPalabras; i++) {
                        palabra = sc.nextLine();
                        if (palabra.isBlank()){
                            throw new InputMismatchException();
                        } else {
                            palabra = palabra.toLowerCase();
                            listaPalabras.add(palabra);
                        }
                    }
                    System.out.println("Lista: ");
                    for (String varPalabra:listaPalabras){
                        System.out.print(varPalabra+" ");
                    }
                    break;
                }
            } catch (InputMismatchException exception){
                System.out.println("No es un formato valido, vuelva a intentarlo");
                sc.nextLine();
            }
        } while (true);
        System.out.println();
        System.out.println("Escribe la palabra a eliminar");
        String palabraEliminar = sc.nextLine(); palabraEliminar = palabraEliminar.toLowerCase();
        if (listaPalabras.contains(palabraEliminar)) {
            listaPalabras.remove(palabraEliminar);
        } else {
            System.out.println("No se encuentra en la lista");
        }
        for (String varPalabra: listaPalabras){
            System.out.print(varPalabra+" ");
        }
        sc.close();
    }
}
