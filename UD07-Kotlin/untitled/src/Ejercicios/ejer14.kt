package Ejercicios

fun invertirCadena(texto: String): String {
    var resultado = ""
    for (i in texto.length - 1 downTo 0) {
        resultado += texto[i]
    }
    return resultado
}

fun main() {
    val original = "Kotlin"
    val invertida = invertirCadena(original)
    println("Cadena invertida: $invertida")
}
