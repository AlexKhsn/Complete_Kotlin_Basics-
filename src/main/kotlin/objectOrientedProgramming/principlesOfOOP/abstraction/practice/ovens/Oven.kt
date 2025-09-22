package objectOrientedProgramming.principlesOfOOP.abstraction.practice.ovens

abstract class Oven() {
    val cookingSpeed = 120
    open val topTemperature = 180

    abstract fun cooking()
}
