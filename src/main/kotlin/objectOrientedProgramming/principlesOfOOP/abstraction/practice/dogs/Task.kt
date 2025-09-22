package objectOrientedProgramming.principlesOfOOP.abstraction.practice.dogs

fun main() {
    val pug: Dog = Pug("Pug")
    val bassetHound: Dog = BassetHound("Basset Hound")
    val chihuahua: Dog = Chihuahua("Chihuahua")

    pug.run()
    pug.bark()
    pug.play()

    println()

    bassetHound.run()
    bassetHound.bark()
    bassetHound.play()

    println()

    chihuahua.run()
    chihuahua.bark()
    chihuahua.play()
}
