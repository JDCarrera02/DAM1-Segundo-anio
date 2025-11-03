package ejercicio3;

import java.util.*;

public class NumerosAleatorios2 {
    public static void main(String[] args) {
        List<Integer>listaNumeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random numR = new Random();
        for (int i = 0; i < 50; i++) {
            int num = numR.nextInt(0,99);
            listaNumeros.add(num);
            System.out.print(num+" ");
        }
        System.out.println();
        int contador = 0;
        int num;
        while (true){
            System.out.println("Selecciona un numero");
            try {
                num = sc.nextInt();
                if (num < 0){
                    System.out.println("No se admiten valores negativos, intenta nuevamente");
                    sc.nextLine();
                } else {
                    for (Integer i:listaNumeros){
                        if (i == num){
                            contador++;
                        }
                    }
                    System.out.println("El numero " + num + " está " + contador +" veces");
                    break;
                }
            } catch (InputMismatchException exception){
                System.out.println("Formato no valido, intente nuevamente");
                sc.nextLine();
            }
        }
    }
}