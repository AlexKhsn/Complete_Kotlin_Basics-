package objectOrientedProgramming.principlesOfOOP.abstraction

fun main() {
    val container: Container = Bottle()
    container.pour()
}

abstract class Container {
    abstract fun pour()
}

class Bottle : Container() {
    override fun pour() {
        println("Pouring bottle")
    }
}

class Jug : Container() {
    override fun pour() {
        println("Pouring jug")
    }
}

/**
 *  1) Абстракция позволяет избегать дублирования кода.
 *  2) Если классы имеют одинаковый функционал, можно вынести методы в отдельный класс, от
 *  которого остальные классы унаследуют этот функционал без дублирования.
 *  3) В родительском классе можно сделать абстрактные методы, которые не инициализируются,
 *  но обязаны быть инициализированы в классах, которые наследуют родительский
 */
