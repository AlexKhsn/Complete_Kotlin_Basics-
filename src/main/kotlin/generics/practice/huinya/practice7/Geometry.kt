package generics.practice.huinya.practice7

class Geometry<T : Shape> {
    fun printArea(shape: T, size: Double) {
        println("Площадь фигуры: ${shape.getArea(size)}")
    }
}
