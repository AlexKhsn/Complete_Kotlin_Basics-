package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceBirds

open class Bird {
    open val color = "grey"
    open val speed = 10

    open fun fly() {
        println("A $color bird's speed is $speed km/h")
    }
}
