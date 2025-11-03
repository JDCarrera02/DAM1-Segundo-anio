package Ejercicios

fun aBinario(numero: Int): String {
    if (numero == 0) return "0"
    var n = numero
    var binario = ""
    while (n > 0) {
        binario = (n % 2).toString() + binario
        n /= 2
    }
    return binario
}

fun main() {
    val numero = 13
    val binario = aBinario(numero)
    println("El número $numero en binario es: $binario")
}
