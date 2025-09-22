package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceAnimals

class Dog(
    override var name: String,
    override var age: Int,
) : Animal() {
    override fun makeSound() {
        println("Гав-Гав!")
    }

    fun wagTail() {
        println("$name виляет хвостом")
    }
}
