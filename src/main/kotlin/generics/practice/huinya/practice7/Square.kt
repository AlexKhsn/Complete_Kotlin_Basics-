package generics.practice.huinya.practice7

class Square : Shape() {
    override fun getArea(size: Double): Double {
        return size * size
    }
}
