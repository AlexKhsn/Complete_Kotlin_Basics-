package objectOrientedProgramming.penis

interface ShapeInterface {
    var color: String?

    // абстрактный метод для получения площади
    fun getArea(): Double

    // абстрактный метод для получения периметра
    fun getPerimeter(): Double

    // общий метод для вывода информации о фигуре
    fun printInfo() {
        println("Цвет: " + color)
        println("Площадь: " + this.getArea())
        println("Периметр: " + this.getPerimeter())
    }
}
