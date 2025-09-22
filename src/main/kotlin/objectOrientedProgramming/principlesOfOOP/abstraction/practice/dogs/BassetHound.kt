package objectOrientedProgramming.principlesOfOOP.abstraction.practice.dogs

class BassetHound(val name: String) : Dog(name) {
    override fun run() {
        println("A $name Hound cannot run")
    }

    override fun bark() {
        println("A $name Hound can bark")
    }

    override fun play() {
        println("A $name Hound can play")
    }
}
