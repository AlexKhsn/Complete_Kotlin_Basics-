package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceTools

open class Tool {
    open val name = ""
    open val material = ""

    open fun use() {
        println("Я использую $name из $material")
    }
}
