package objectOrientedProgramming.penis

fun main() {
    println("Hello, World!")

    val circle = Circle("Красный", 5.0)
    val rectangle = Rectangle("Синий", 4.0, 6.0)

    val shapeList: List<Shape> = listOf(circle, rectangle)
    val a = shapeList.sumOf { it.getArea() }
}
