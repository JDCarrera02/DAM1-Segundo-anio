package Ejer7;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita la nota: ");
        double nota = sc.nextDouble();
        System.out.println(estadoNota(nota));
    }

    public static String estadoNota(double nota){
        if (nota ==9 || nota == 10){
            return "Sobresaliente";
        } else if (nota == 8 || nota == 7) {
            return "Notable";
        } else if (nota == 6 || nota == 5) {
            return "Aprobado";
        } else if (nota <= 4 && nota >= 0){
            return "Suspenso";
        }
        return "No es una nota valida";
    }
}