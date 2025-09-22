package objectOrientedProgramming.principlesOfOOP.inheritance

fun main() {
    val mom = _root_ide_package_.objectOrientedProgramming.principlesOfOOP.inheritance.Mom("french")
    val daughter = _root_ide_package_.objectOrientedProgramming.principlesOfOOP.inheritance.Daughter("not french")

    println("Mother's hair color: ${mom.hairColor}")
    println("Mother's eye color: ${mom.eyeColor}")
    mom.say("Hi!")

    println()

    println("Daughter's hair color: ${daughter.hairColor}")
    println("Daughter's eye color: ${daughter.eyeColor}")
    daughter.say("What's up?")
}

open class Mom(nativeLanguage: String) {
    open val hairColor = "brown"
    val eyeColor = "blue"

    open fun say(message: String) {
        println("Mom says: '$message'")
    }
}

class Daughter(nativeLanguage: String) : objectOrientedProgramming.principlesOfOOP.inheritance.Mom(nativeLanguage) {
    override val hairColor = "blonde"

    override fun say(message: String) {
        println("Daughter says: '$message'")
        super.say(message)
        println("Mother has ${super.hairColor} hair color")
    }
}
