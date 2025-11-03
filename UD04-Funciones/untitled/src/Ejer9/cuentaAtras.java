package Ejer9;
/*
* Ejercicio 1 de recursividad
* Crea una función que realice una cuenta atrás partiendo de un número entero
* recibido como parámetro y utilizando recursividad.
*
* Razonamiento:
* Pido el numero de cual voy a partir
* dentro de la funcion hago una sentencia if que valide si el numero es igual o mayor a cero
* en cada iteracion que hago voy restando uno al numero dado hasta llegar a cero
* luego de restar, hago el respectivo return y llamo a la misma funcion
* voy imprimiendo el resultado
* termino el programa.
*
* PseudoCodigo:
* Inicio Programa
*   Definir numero Como Entero;
*   Escribir "Digita un numero entero positivo";
*   Leer numero;
*   llamar funcionCuentaAtras(numero);
*
*   Funcion Entero funcionCuentaAtras(Entero numero)
*
*       Si (numero > 0) entonces
*           numero -> numero - 1;
*           Retorno funcionCuentaAtras(numero);
*       sino
*           Retorno numero
* */

import java.util.Scanner;

public class cuentaAtras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita un numero entero positivo");
        int numero;
        if (sc.hasNextInt()){
            numero = sc.nextInt();
            System.out.println("Cuenta atras del numero " + numero + ": ");
            contarAtras(numero);
        } else {
            System.out.println("No es un formato valido");
        }
    }

    static int contarAtras(int numero){
        if (numero > 0){
            System.out.print(numero + " ");
            numero -= 1;
            return contarAtras(numero);
        } else {
            System.out.print(numero);
            return numero;
        }
    }
}