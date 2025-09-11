package operatorsAndBooleans

fun main(args: Array<String>) {
    val isDay = true
    val isEvening = true
    println(isDay && isEvening)

    println()

    val isSummer = false
    val isAutumn = true
    println(isSummer && isAutumn)

    println()

    val isBike = false
    val isCar = false
    println(isBike && isCar)

    println()

    val js = true
    val kotlin = true
    println(js || kotlin)

    println()

    val ball = true
    val notBall = false
    println(notBall || ball)

    println()

    val computer = false
    val laptop = false
    println(computer || laptop)

    println()

    val winter = false
    println(!winter)
}
