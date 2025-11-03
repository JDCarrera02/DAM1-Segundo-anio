package Ejercicios

import java.util.Scanner

// Funcion recursiva que calcula el factorial de un numero

fun factorial(num: Int): Long {
    return if (num <= 1) 1
    else num * factorial(num - 1)
}

fun main(){
    println("Digita un numero: ")
    val scanner = Scanner(System.`in`)
    val numero = scanner.nextInt()

    if (numero < 0){
        println("No se admiten numeros negativos")
    } else {
        val resultado = factorial(numero)
        println(resultado)
    }
}