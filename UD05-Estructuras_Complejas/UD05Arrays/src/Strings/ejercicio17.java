package Strings;

import java.util.Scanner;

public class ejercicio17{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String textoSinEspacios = sc.nextLine();
        eliminarEspacios(textoSinEspacios);
        
    }
    static void eliminarEspacios(String texto){
        texto = texto.replaceAll(" ", "");
        System.out.println(texto);
    }
}