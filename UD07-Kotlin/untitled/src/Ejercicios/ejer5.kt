package Ejercicios

fun main(){
    val nums = listOf(2, 3, 5, 9, 4)

    println(segundoMayor(nums))
}

fun segundoMayor(lista: List<Int>): Int? {
    val sinDuplicados = lista.distinct()
    if (sinDuplicados.size < 2) return null
    return sinDuplicados.sortedDescending()[1]
}