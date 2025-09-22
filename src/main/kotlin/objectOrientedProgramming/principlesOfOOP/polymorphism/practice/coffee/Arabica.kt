package objectOrientedProgramming.principlesOfOOP.polymorphism.practice.coffee

class Arabica: Coffee {
    override fun wakeUp() {
        println("Arabica woke you up")
    }
    override fun quenchThirst() {
        println("Arabica quenched your thirst")
    }
}
