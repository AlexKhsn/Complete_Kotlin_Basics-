package operatorsAndBooleans

//  Task 1

/*
fun main(Args : Array<String>) {
    println("Введи первое число: ")
    val x = (readLine()?:"0").toInt()
    println("Введи второе число: ")
    val y = (readLine()?:"0").toInt()
    val addition = x + y
    val subtraction = x - y
    val multiplication = x * y
    val division = x.toDouble() / y
    val remainder = x % y

    println("$x + $y = $addition (${addition::class.java})")
    println("$x - $y = $subtraction (${subtraction::class.java})")
    println("$x * $y = $multiplication (${multiplication::class.java})")
    println("$x / $y = $division (${division::class.java})")
    println("$x % $y = $remainder (${remainder::class.java})")
    println("$x > $y - ${x > y}")
    println("$x = $y - ${x == y}")
    println("$y != 0 - ${y != 0}")
}
 */

//  Task 2

/*
fun main(Args : Array<String>) {
    println("Введи свой возраст: ")
    val age = (readLine()?:"0").toInt()
    println("Есть ли у тебя права? (yes/no)")
    var licenceInput = readLine()
    val hasLicence = licenceInput == "yes"

    println("Возраст больше или равен 18 И есть права - ${age >= 18 && hasLicence}")
    println("Возраст больше 65 ИЛИ возраст меньше 25 - ${age > 65 || age < 25}")
    println("НЕ (возраст меньше 16) - ${!(age >= 16)}")
    println("Возраст от 18 до 30 включительно - ${age >=18 && age <= 30}")
}
 */

//  Task 3

/*
fun main(Args : Array<String>) {
    var score = 100
    val multiplier = 1.5
    val isHighScore: Boolean
    val isLowScore: Boolean

    println("Начальное значение: $score (${score::class.java})")

    score += 50
    println("После += 50: $score (${score::class.java})")

    score -= 25
    println("После -= 25: $score (${score::class.java})")

    score *= 2
    println("После *= 2: $score (${score::class.java})")

    score /= 3
    println("После /= 3: $score (${score::class.java})")

    isHighScore = score > 200
    isLowScore = !isHighScore

    println("isHighScore (больше 200): $isHighScore")
    println("isLowScore (инверсия): $isLowScore")
}
 */

//  Task 4

/*
fun main(Args : Array<String>) {
    println("Введи возраст: ")
    val age = (readLine()?:"0").toInt()

    println("Есть ли VIP статус? (yes / no)")
    val vipInp = readLine()
    val isVip = vipInp == "yes"

    println("Введи баланс счета: ")
    val balance = (readLine()?:"0").toDouble()

    val canEnterClub = (age >= 21) && (isVip || balance >= 1000)
    val getDiscount = (age > 60) || (age < 25 && balance > 500)
    val needsSupervision = age < 18 && !isVip

    println("может зайти в клуб? - $canEnterClub")
    println("получит ли скидку? - $getDiscount")
    println("нужен ли сопровождающий? - $needsSupervision")

    if (canEnterClub) {
        println("Доступ разрешен!")
    } else {
        println("Доступ запрещен!")
    }
}
 */

//  Task 5

fun main(Args: Array<String>) {
    println("Введи первое число: ")
    val a = (readLine() ?: "0").toInt()
    println("Введи второе число: ")
    val b = (readLine() ?: "0").toInt()
    var result = 0

    println("Начальное значение: $result")

    result += a * b
    println("Результат после += $a * $b: $result")

    result -= a + b
    println("Результат после -= $a + $b: $result")

    result *= 2
    println("Результат после *= 2: $result")

    val bothPositive = a > 0 && b > 0
    println("Оба числа положительные - $bothPositive")
    val differentSigns = (a > 0 && b < 0) || (a < 0 && b > 0)
    println("числа имеют разные знаки (одно положительное, другое отрицательное) - $differentSigns")
    val resultInRange = result in -100..100
    println("результат находится в диапазоне от -100 до 100 включительно - $resultInRange")
    val complexCondition = (a % 2 == 0 || b % 2 != 0) && !(result == 0)
    println("a чётное ИЛИ b нечётное) И НЕ(result равен нулю) - $complexCondition")

    println("Анализ завершён. Результат: $result")
}
