package generics

fun main() {
    val myBox1 = Box<String>()
    val myBox2 = Box<Int>()
    myBox1.display("String")
    myBox2.display(234)

    val carBox = Box<Car>()
    carBox.display(Car())

    val myNewBox = NewBox<Int, Float>()
    myNewBox.display(2, 34.4F)
}

class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

class Car {

}

class NewBox<T, U> {
    fun display(item1: T, item2: U) {
        println(item1)
        println(item2)
    }
}
