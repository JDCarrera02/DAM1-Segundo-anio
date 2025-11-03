package Ejer10;
/*
* El factorial de un numero tiene la formula = !n = n*(n-1)*(n-2)
* Ejemplo: !5 = 5*4*3*2*1
*
* Razonamiento:
* Pido el numero = 4
* Lo meto en la funcion = factorial(4)
* Dentro de la funcion hago
* creo una variable que acumulara el producto de las multiplicaciones
* la inicializo al numero introducido y entro al bucle for
* for (int i = 1 ; i < 4 ; i++)
* primera vuelta i = 1, acumulador = 4
* 4 = 4 * i
* imprimo el resultado
* Segunda vuelta i = 2, acumulador = 4
* 4 = 4 * i : 8
* imprimo el resultado
* Tercera vuelta i = 3, acumulador = 8
* 4 = 8 * i : 24
* imprimo el resultado
* Cuarta vuelta i = 4 es igual al numero, no entro al bucle
* salgo de la funcion
* termino el programa.
*
* Pseudocodigo:
* Inicio_programa
*   Definir numero como Entero;
*   Escribir "Escribe un numero: ";
*   Leer numero;
*   Llamar factorialNumero(numero);
*
*   Declarar proceso factorialNumero(Entero numero)
*       Definir acumulador como Entero;
*       acumulador -> numero;
*       Para i desde 1 hasta numero con paso 1 hacer
*           acumulador -> acumulador * i
*           Escribir i , "*";
*       FinPara
*   FinFuncion
* */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita un numero");
        int numero;
        if (sc.hasNextInt()){
            numero = sc.nextInt();
            factorialNumero(numero);
        } else {
            System.out.println("Formato no valido");
        }
    }

    static void factorialNumero(int numero){
        int acumulador = 1;
        if (numero == 0 || numero == 1){
            System.out.println(numero);
        } else if (numero < 0) {
            System.out.println("No se admiten valores negativos");
            System.out.println(numero);
        }
        System.out.print("Factorial de " + numero + "! = ");
        for (int i = 1; i <= numero; i++) {
            acumulador *= i;
            System.out.print(i);
            if (i < numero){
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + acumulador);
    }
}