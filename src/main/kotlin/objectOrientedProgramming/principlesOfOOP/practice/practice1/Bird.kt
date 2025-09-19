package objectOrientedProgramming.principlesOfOOP.practice.practice1

open class Bird {
    var name = ""
    var color = ""
    var flySpeed = 0

    constructor(name: String, color: String, flySpeed: Int) {
        this.name = name
        this.color = color
        this.flySpeed = flySpeed
    }

    fun fly() {
        println("A $color $name's fly speed is $flySpeed km/h")
    }
}
