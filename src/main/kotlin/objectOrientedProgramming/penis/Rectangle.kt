package objectOrientedProgramming.penis

class Rectangle(color: String?, private val length: Double, private val width: Double) : Shape(color) {
    override fun getArea(): Double {
        return length * width
    }

    override fun getPerimeter(): Double {
        return 2 * (length + width)
    }
}
