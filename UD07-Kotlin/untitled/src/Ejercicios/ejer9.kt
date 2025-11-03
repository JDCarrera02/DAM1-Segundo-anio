package Ejercicios

fun eliminarDuplicados(lista: List<Int>): List<Int> {
    val resultado = mutableListOf<Int>()
    val vistos = mutableSetOf<Int>()
    for (numero in lista) {
        if (numero !in vistos) {
            resultado.add(numero)
            vistos.add(numero)
        }
    }
    return resultado
}

fun main() {
    val numeros = listOf(1, 2, 2, 3, 1, 4, 5, 4)
    val sinDuplicados = eliminarDuplicados(numeros)
    println("Sin duplicados (orden conservado): $sinDuplicados")
}
