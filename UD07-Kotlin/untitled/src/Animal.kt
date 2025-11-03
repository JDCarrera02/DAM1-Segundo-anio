interface Animal {
    fun hacerSonido()
}

class Perro : Animal {
    override fun hacerSonido() {
        println("Guau!")
    }
}