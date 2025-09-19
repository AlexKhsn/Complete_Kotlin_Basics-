package userInput

import kotlin.random.Random

fun main() {
    println(Random.nextInt()) // Возращает случайное число
    println(Random.nextInt(10)) // Возвращает случайное число от 0 до указанного(не включая)
    println(Random.nextInt(10, 20)) // Возвращает случайное число от указанного(включительно) до указанного(не включая)
    println(Random.nextDouble(10.0, 20.0)) // Возращает случайное число с плавающей точкой от(включительно) и до(не включая)
}
