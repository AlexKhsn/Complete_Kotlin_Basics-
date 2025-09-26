package generics.practice.claudePractice

open class Vehicle(val model: String, var speed: Int) {
    open fun drive() {
        println("$model едет со скоростью $speed км/ч")
    }

    fun accelerate() {
        speed += 10
    }
}
