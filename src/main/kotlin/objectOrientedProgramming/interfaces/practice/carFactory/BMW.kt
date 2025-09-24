package objectOrientedProgramming.interfaces.practice.carFactory

class BMW : Car {
    override var speed = 200

    override fun drive() {
        println("BMW drives at $speed km/h")
    }

    override fun park() {
        println("BMW parks")
    }
}
