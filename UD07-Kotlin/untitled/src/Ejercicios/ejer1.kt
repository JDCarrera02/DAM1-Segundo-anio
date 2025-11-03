package Ejercicios

fun main(){
    println("Digita un numero: ")
    var num1 = readln()
    println("Digita otro numero: ")
    var num2 = readln()

    if (num1 > num2) {
        println("Numero mayor: $num1")
    } else {
        println("Numero mayor: $num2")
    }
}