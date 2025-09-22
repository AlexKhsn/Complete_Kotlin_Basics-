package objectOrientedProgramming.principlesOfOOP.abstraction.practice.dogs

class Pug(val name: String) : Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name cannot bark")
    }

    override fun play() {
        println("A $name can play")
    }
}
