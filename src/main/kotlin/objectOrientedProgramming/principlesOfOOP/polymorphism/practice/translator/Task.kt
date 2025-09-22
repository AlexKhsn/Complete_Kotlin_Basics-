package objectOrientedProgramming.principlesOfOOP.polymorphism.practice.translator

fun main() {
    val translator = Translator()
    translator.sayHello()
    translator.sayHello("french")
    translator.sayHello("spanish")
    translator.sayHello("english")
    translator.sayHello("russian")
}
