package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceGameCharacters

open class Character {
    open val name = "default"
    var health = 100
    open var level = 1

    open fun introduce() {
        println("Игрок: $name, Здоровье: $health, Уровень: $level")
    }

    open fun attack(): Int {
        println("$name атакует")
        return 0
    }

    open fun takeDamage(damage: Int) {
        health -= damage
    }
}
