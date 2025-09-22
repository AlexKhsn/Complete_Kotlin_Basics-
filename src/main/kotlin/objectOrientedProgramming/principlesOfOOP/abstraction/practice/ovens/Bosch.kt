package objectOrientedProgramming.principlesOfOOP.abstraction.practice.ovens

class Bosch : Oven() {
    override val topTemperature = 250

    override fun cooking() {
        println("Bosch is cooking in $cookingSpeed seconds at $topTemperature temperature.")
    }
}
