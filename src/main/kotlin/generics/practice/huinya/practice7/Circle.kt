package generics.practice.huinya.practice7

class Circle : Shape() {
    override fun getArea(size: Double): Double {
        return size * size * 3.1415
    }
}
