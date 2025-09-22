package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceAnimals

open class Animal {
    open var name = "Животное"
    open var age = 0

    open fun makeSound() {
        println("Животное издает звук")
    }

    fun introduce() {
        println("Меня зовут $name, мне $age лет")
    }
}
