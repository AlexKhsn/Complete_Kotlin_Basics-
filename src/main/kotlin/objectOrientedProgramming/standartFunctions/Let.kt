package objectOrientedProgramming.standartFunctions

fun main() {
    val animals = listOf("cat", "dog", "parrot", "bear", "mouse")
    animals.map { it.length }
        .filter { it > 3 }
        .let {
            println(it)
            println("Size of list is ${it.size}")
        }

    animals.map { it.length }
        .filter { it > 3 }
        .let(::println)

    val name = readln()
    name?.let {
        println("Your name is $it")
    }

    // Сравнение с with

    Animal().let {
        it.paws = 5
        it.voice()
        println("Animal makes a sound")
    }
}

class Animal {
    var paws = 4

    fun voice() {
        println("I have $paws paws")
    }
}
