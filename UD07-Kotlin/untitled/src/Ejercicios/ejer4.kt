package Ejercicios

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    println("Digita un numero")
    val numero = sc.nextInt()

    if (numeroPrimo(numero)){
        println("El numero $numero, es primo")
    } else {
        println("El numero $numero, no es primo")
    }
}

fun numeroPrimo(numero:Int) : Boolean{
    // Si el numero es 1 o negativo, se retorna falso, ya que no son numeros primos, recordar la primera condicion
    if (numero <= 1) {
        return false
    }
    // Si es mayor 1, se hace el for hasta el numero, empezando desde 2
    for (i in 2..<numero)
        if (numero % i == 0){ // Si el modulo del numero entre el valor que tenga i, es cero (es divisible), retornar falso
            return false
        }
    return true // Si despues de recorrer los numeros hasta el numero dado, y no hay divisores, entonces es primo
}