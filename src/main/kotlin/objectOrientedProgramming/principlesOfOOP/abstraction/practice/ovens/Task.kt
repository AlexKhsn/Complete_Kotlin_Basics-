package objectOrientedProgramming.principlesOfOOP.abstraction.practice.ovens

fun main() {
    val bosch: Oven = Bosch()
    val roaster: Oven = Roaster()

    bosch.cooking()
    roaster.cooking()
}
