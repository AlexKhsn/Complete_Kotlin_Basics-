package generics.practice.huinya.practice7

fun main() {
    val square = Square()
    val circle = Circle()

    println("Площадь квадрата: ${square.getArea(5.0)}")
    println("Площадь круга: ${circle.getArea(4.3)}")

    val squareGeometry = Geometry<Square>()
    val circleGeometry = Geometry<Circle>()

    squareGeometry.printArea(square, 4.8)
    circleGeometry.printArea(circle, 3.2)
}
