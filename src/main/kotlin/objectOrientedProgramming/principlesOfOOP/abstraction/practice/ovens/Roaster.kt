package objectOrientedProgramming.principlesOfOOP.abstraction.practice.ovens

class Roaster : Oven() {
    override fun cooking() {
        println("A roaster roasts at $topTemperature for $cookingSpeed minutes")
    }
}
