package objectOrientedProgramming.penis

abstract class Shape(protected var color: String?) : HasArea, HasPerimeter {
    // общий метод для вывода информации о фигуре
    fun printInfo() {
        println("Цвет: " + color)
        println("Площадь: " + this.getArea())
        println("Периметр: " + this.getPerimeter())
    }
}
