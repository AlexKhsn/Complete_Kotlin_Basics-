package objectOrientedProgramming.standartFunctions.practice.run.practice2

fun main() {
    val laptop1 = Laptop().run {
        turnOff()
        turnOn()
        println("Laptop1 works")

        this
    }
    val laptop2 = Laptop().run {
        turnOff()
        turnOn()
        println("Laptop2 works")
        this
    }

    run {
        val laptop1 = Laptop()
        val laptop2 = Laptop()

        laptop1.turnOff()
        laptop1.turnOn()

        laptop2.turnOff()
        laptop2.turnOn()
    }
}
