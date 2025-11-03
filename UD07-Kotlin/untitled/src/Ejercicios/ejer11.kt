package Ejercicios

fun ordenarStringsPorLongitud(lista: List<String>): List<String> {
    return lista.sortedBy { it.length }
}

fun main() {
    val lista = listOf("uno", "tres", "cuatro", "a", "doce")
    val ordenada = ordenarStringsPorLongitud(lista)
    println("Strings ordenados por longitud: $ordenada")
}
