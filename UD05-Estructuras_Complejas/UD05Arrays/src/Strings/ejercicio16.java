package Strings;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String convertirNum = num1 + "";
        String numInvertido = "";
        if (num1 > 0 && num1 >=10) {
            for(int i = convertirNum.length()-1 ; i >= 0 ; i-- ){
                numInvertido += convertirNum.charAt(i);
            }
            System.out.println("Numero invertido = "+ numInvertido);
            

        } else if(num1 < 0 && num1 <= -10){
            for(int i = convertirNum.length()-1 ; i >= 1 ; i-- ){
                numInvertido += convertirNum.charAt(i);
            }
            System.out.println("Numero invertido = " + "-"+numInvertido);
        } else{
            System.out.println("El número es de una sola cifra, no se puede invertir = " + num1);

        }
        sc.close();
        sc.close();
    }
}