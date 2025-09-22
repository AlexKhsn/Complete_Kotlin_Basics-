package objectOrientedProgramming.principlesOfOOP.polymorphism

fun main() {
    val mom = Mom()
    mom.say("Hi!")
    mom.say()
    mom.say("What's up?!", 3)
    mom.say(2)

    println()

    val daughter = Daughter()
    daughter.say("Hi!")
    daughter.say()
    daughter.say("Go", 4)
    daughter.say(3)
}

open class Mom {
    open fun say(message: String) {
        println("Mom says: '$message'")
    }

    fun say(times: Int) {
        for (i in 1..times) {
            println("Mom says it $times times")
        }
    }

    fun say() {
        println("Mom says something")
    }

    fun say(message: String, times: Int) {
        var i = 0
        while (i < times) {
            println("Mom says: $message")
            i++
        }
    }
}

class Daughter : Mom() {
    override fun say(message: String) {
        println("Daughter says: '$message'")
    }
}

/**
 *  Полиморфизм значит одно имя - множество форм
 *  Метод/функция могут выполнять различные действия в разных ситуациях
 *
 *  Существует 2 типа полиморфизма:
 *  1) Динамический (Dynamic) - method overriding
 *  2) Статический (Static) - method overloading
 *
 *
 *  Overriding (перезапись) -
 *  наследуется от родительского класса и заменяет функционал на тот который нужен (open - override).
 *  То есть один метод имеет разные функциональности в зависимости от того где вызван
 *
 *  Overloading (перегрузка) -
 *  можно объявить еще один метод/функцию с таким же именем, но
 *      1) с другим типом параметра
 *      2) с другим кол-вом параметров
 *  В зависимости от того с каким кол-вом или типом параметра будет вызываться метод, такой метод и будет вызван
 *
 */
