package generics.practice.claudePractice

class Car(model: String, speed: Int) : Vehicle(model, speed) {
    override fun drive() {
        println("Автомобиль $model едет со скоростью $speed км/ч")
    }
}
