package objectOrientedProgramming.principlesOfOOP.abstraction.practice.dogs

class Chihuahua(val name: String) : Dog(name) {
    override fun run() {
        println("An old $name can run")
    }

    override fun bark() {
        println("An old $name can bark")
    }

    override fun play() {
        println("An old $name cannot play")
    }
}
