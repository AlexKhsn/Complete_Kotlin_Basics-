package objectOrientedProgramming.penis

class Circle(color: String?, private val radius: Double) : Shape(color) {
    override fun getArea(): Double {
        return Math.PI * radius * radius
    }

    override fun getPerimeter(): Double {
        return 2 * Math.PI * radius
    }
}
