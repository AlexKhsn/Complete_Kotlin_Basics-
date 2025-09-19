package objectOrientedProgramming.introduction.practice

fun main() {
    //  Exercise 1

    val rabbit = Animal()
    rabbit.run()

    rabbit.name = "Rabbit"
    rabbit.topSpeed = 30
    rabbit.run()

    rabbit.topSpeed = 50
    rabbit.run()

    println()

    //  Exercise 2

    val calculator = Math()
    println(calculator.add(1, 5))
    println(calculator.sub(1, 5))
    println(calculator.mul(1, 5))
    println(calculator.div(20, 5))

    println()

    //  Exercise 3

    val jetpack = Jetpack()
    jetpack.burn(4)
    println()
    jetpack.stop(1)
    println()
    jetpack.stop(1)

    println()

    //  Exercise 4

    val calculator2 = Calculator()
    calculator2.add(5.0)
    calculator2.add(2.0)
    calculator2.mul(3.0)
    calculator2.sub(6.0)
    calculator2.div(6.0)
    calculator2.reset()
}

class Animal {
    var name = "Animal"
    var topSpeed = 0

    fun run() {
        println("The $name runs at the speed of $topSpeed km/h")
    }
}

class Math {
    fun add(a: Int, b: Int): Int = a + b

    fun sub(a: Int, b: Int): Int = a - b

    fun mul(a: Int, b: Int): Int = a * b

    fun div(a: Int, b: Int): Int = a / b
}

class Jetpack {
    var userHeight = 0

    fun burn(seconds: Int) {
        for (i in 1..seconds) {
            println("$i sec - 1 meter higher")
            userHeight++
        }
        println("Your height is $userHeight meters")
    }

    fun stop(seconds: Int) {
        for (i in 1..seconds) {
            if (userHeight - 3 < 0) {
                userHeight = 0
                println("$i sec - You touched the ground")
                break
            }

            userHeight -= 3
            println("$i sec - 3 meters down")
        }

        println("Your height is $userHeight meter(s)")
    }
}

class Calculator {
    var total = 0.0

    fun add(number: Double) {
        println("$total + $number = ${total + number}")
        total += number
    }

    fun sub(number: Double) {
        println("$total - $number = ${total - number}")
        total -= number
    }

    fun mul(number: Double) {
        println("$total * $number = ${total * number}")
        total *= number
    }

    fun div(number: Double) {
        println("$total / $number = ${total / number}")
        total /= number
    }

    fun reset() {
        total = 0.0
        println("Total = $total")
    }
}
