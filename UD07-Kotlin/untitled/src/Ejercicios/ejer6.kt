package Ejercicios

fun contarLetras(texto: String): Map<Char, Int> {
    return texto.filter { it.isLetter() }
        .groupingBy { it.lowercaseChar() }
        .eachCount()
}

fun main() {
    val texto = "Hola Kotlin!"
    val conteo = contarLetras(texto)
    println("Frecuencia de letras:")
    conteo.forEach { (letra, cantidad) ->
        println("$letra: $cantidad")
    }
}