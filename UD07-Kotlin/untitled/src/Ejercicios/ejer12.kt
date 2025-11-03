package Ejercicios

fun convertirABinario(numero: Int): String {
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
    val numero = 42
    val binario = convertirABinario(numero)
    println("El número $numero en binario es: $binario")
}