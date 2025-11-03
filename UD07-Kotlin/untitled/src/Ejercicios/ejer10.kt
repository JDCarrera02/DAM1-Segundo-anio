package Ejercicios

fun contarFrecuenciaLetras(texto: String): Map<Char, Int> {
    return texto.filter { it.isLetter() }
        .groupingBy { it.lowercaseChar() }
        .eachCount()
}

fun main() {
    val frase = "Kotlin es increíble"
    val frecuencias = contarFrecuenciaLetras(frase)
    println("Frecuencia de letras:")
    frecuencias.forEach { (letra, cantidad) ->
        println("$letra: $cantidad")
    }
}
