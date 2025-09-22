package objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.practice.practiceSecretFormula

class Franchise : objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.practice.practiceSecretFormula.Restaurant() {
    fun prepareBurger() {
        println("Preparing burgers according to the secret formula: ")
        println(applyFormula())
    }
}
