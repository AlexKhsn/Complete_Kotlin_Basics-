package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceBirds

class Parakeet : Bird() {
    override val color = "yellow"
    override val speed = 25

    override fun fly() {
        super.fly()
        println("A ${super.color} bird can fly up to ${super.speed} km/h")
    }
}
