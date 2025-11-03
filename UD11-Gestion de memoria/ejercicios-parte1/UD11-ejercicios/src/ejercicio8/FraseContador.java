package ejercicio8;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FraseContador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la frase al usuario
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase();

        // Mapa para contar la frecuencia de cada letra
        Map<Character, Integer> conteoLetras = new TreeMap<>(); // TreeMap ordena automáticamente las claves
        // Recorrer la frase carácter por carácter
        for (char letra : frase.toCharArray()) {
            if (Character.isLetter(letra)) { // Solo contar letras
                conteoLetras.put(letra, conteoLetras.getOrDefault(letra, 0) + 1);
            }
        }

        // Imprimir los resultados
        System.out.println("Letras ordenadas y su frecuencia:");
        for (Map.Entry<Character, Integer> entry : conteoLetras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}