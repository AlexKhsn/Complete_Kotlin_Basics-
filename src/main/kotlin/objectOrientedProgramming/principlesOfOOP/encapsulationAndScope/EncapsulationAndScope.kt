package objectOrientedProgramming.principlesOfOOP.encapsulationAndScope

fun main() {
    val airplane = _root_ide_package_.objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.Airplane()
    val myAirplane = _root_ide_package_.objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.MyAirplane()
    val myCar = _root_ide_package_.objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.MyCar()

    println(airplane.type)
    println(myAirplane.type)
    myAirplane.fly()
}

open class Airplane {
    internal var type = "Airbus"

    internal fun fly() {
        println("Flying")
    }
}

class MyAirplane : objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar() {
    fun start() {
        val airplane = _root_ide_package_.objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.Airplane()
        println(airplane.type)
        airplane.fly()
    }
}

/**
 *  Переменные и функции доступны в блоке кода, в котором они созданы (scope).
 *  Классы могут изменить область видимости их переменных/функций
 *
 *  Модификаторы:
 *
 *  1) private - видимы только внутри класса в котором созданы
 *  2) protected - видимы только внутри класса в котором созданы, а так же доступны в классах наследующих его
 *  3) internal - доступны во всех классах, если они находятся в пределах одного package
 *  4) public - доступны любому кто имеет доступ к классу (модификатор по-умолчанию)
 *
 *  public/private/protected/internal val name = "Example"
 */
