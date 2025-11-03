package Ejercicios

fun ordenarPorLongitud(lista: List<String>): List<String> {
    return lista.sortedBy { it.length }
}

fun main() {
    val palabras = listOf("Kotlin", "es", "genial", "y", "conciso")
    val ordenadas = ordenarPorLongitud(palabras)
    println("Ordenadas por longitud: $ordenadas")
}
