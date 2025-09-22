package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceAnimals

fun main() {
    val dog = Dog("Reks", 1)
    val cat = Cat("Murzik", 2)

    dog.makeSound()
    dog.wagTail()

    cat.makeSound()
    cat.purr()
}
