package functions.lambdaFunctions

fun main() {
    val sayHello = { name: String -> println("Hello, $name!") }
    sayHello("Alex")

    val addTwo = { num: Int -> num + 2 }
    println(addTwo(5))

    val multiplyBy5 = { num: Int ->
        val result = num * 5
        result
    }
    println(multiplyBy5(5))

    val get = { 45 }
    println(get())

    val calculate = { a: Int, b: Int ->
        val sum = a + b
        val mul = a * b

        sum
    }
    println(calculate(4, 5))
}

/**
 *  1) Лямбда-функции не имеют имени
 *  2) Могут принимать параметры
 *  3) Могут быть присвоены переменной
 *  4) Могут быть переданы в другую функцию
 *  5) Возращает либо последнее значение, либо Unit если нет возвращаемого значения, либо указанное значение
 */
