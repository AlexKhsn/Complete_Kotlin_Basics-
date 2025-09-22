package objectOrientedProgramming.principlesOfOOP.polymorphism.practice.coffee

class Robusta: Coffee {
    override fun wakeUp() {
        println("Robusta woke you up")
    }
    override fun quenchThirst() {
        println("Robusta quenched your thirst")
    }
}
