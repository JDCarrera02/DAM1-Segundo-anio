package Ejercicios

fun eliminarDuplicadosOrden(lista: List<Int>): List<Int> {
    val resultado = mutableListOf<Int>()
    val vistos = mutableSetOf<Int>()
    for (n in lista) {
        if (n !in vistos) {
            resultado.add(n)
            vistos.add(n)
        }
    }
    return resultado
}

fun main() {
    val lista = listOf(5, 1, 3, 1, 5, 2, 3, 4)
    val limpia = eliminarDuplicadosOrden(lista)
    println("Lista sin duplicados (orden conservado): $limpia")
}
