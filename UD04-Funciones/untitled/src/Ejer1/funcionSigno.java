package Ejer1;

import java.util.Scanner;

public class funcionSigno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        while (true){
            if (sc.hasNextInt()){
                numero = sc.nextInt();
                System.out.println(signo(numero));
                break;
            }
            System.out.println("No es un formato valido");
            sc.nextLine();
        }

    }

    public static int signo(double num){
        if (num < 0 ){
            return -1;
        } else if (num > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}