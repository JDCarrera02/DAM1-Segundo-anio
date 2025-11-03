package Ejer3;

import java.util.Scanner;

public class potenciaDeUnNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int base = sc.nextInt();
        System.out.println("Ingrese su potencia: ");
        int potencia = sc.nextInt();
        System.out.println(multiplicacionSucesiva(base,potencia));
    }

    public static int multiplicacionSucesiva(int base, int potencia){
        if (potencia==0){
            return 1;
        }
        if (potencia < 0){
            potencia *= -1;
            return multiplicacionSucesiva(base,potencia);
        }
        for (int i = 1 ; i < potencia; i++){
            base *= base;
        }
        return base;
    }
}