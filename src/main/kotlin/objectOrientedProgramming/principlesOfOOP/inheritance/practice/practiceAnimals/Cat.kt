package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceAnimals

class Cat(
    override var name: String,
    override var age: Int,
) : Animal() {
    override fun makeSound() {
        println("Мяу!")
    }

    fun purr() {
        println("$name мурчит")
    }
}
