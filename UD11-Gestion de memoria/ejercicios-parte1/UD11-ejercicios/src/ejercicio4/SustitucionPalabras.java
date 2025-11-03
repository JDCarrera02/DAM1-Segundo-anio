package ejercicio4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SustitucionPalabras {
    public static void main(String[] args) {
        List<String>listaPalabras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas palabras desea añadir?");
        int numPalabras;
        String palabra;
        while (true){
            try {
                numPalabras = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < numPalabras; i++) {
                    palabra = sc.nextLine();
                    palabra = palabra.toLowerCase();
                    listaPalabras.add(palabra);
                }
                System.out.println("Lista: ");
                for (String varPalabra:listaPalabras){
                    System.out.print(varPalabra+" ");
                }
                break;
            } catch (InputMismatchException exception){
                System.out.println("No es un formato valido, vuelva a intentarlo");
                sc.nextLine();
            }
        }
        System.out.println();
        System.out.print("Escribe la palabra a reemplazar: ");
        String palabra1 = sc.nextLine();
        palabra1 = palabra1.toLowerCase();
        System.out.println("Escribe el reemplazo de esa palabra: ");
        String palabraReemplazo = sc.nextLine();
        palabraReemplazo = palabraReemplazo.replaceAll("\\s+","");

        for (String varPalabra:listaPalabras){
            if (listaPalabras.contains(palabra1)) {
                if (varPalabra.equalsIgnoreCase(palabra1)){
                    varPalabra = palabraReemplazo;
                }
            } else {
                System.out.println("La palabra no se encuentra en la lista");
                break;
            }
            System.out.print(varPalabra+" ");
        }
    }
}