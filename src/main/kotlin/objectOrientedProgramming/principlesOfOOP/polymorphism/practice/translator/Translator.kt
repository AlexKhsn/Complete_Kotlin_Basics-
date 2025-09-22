package objectOrientedProgramming.principlesOfOOP.polymorphism.practice.translator

class Translator {
    fun sayHello() {
        println("Hello")
    }

    fun sayHello(language: String) {
        when (language) {
            "french" -> println("Bonjour")
            "spanish" -> println("Hola")
            else -> sayHello()
        }
    }
}
