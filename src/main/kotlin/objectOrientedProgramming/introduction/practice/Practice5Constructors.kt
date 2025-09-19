package objectOrientedProgramming.introduction.practice

fun main() {
    val table1 = Table()
    val table2 = Table(5)
    val table3 = Table(3, 140)

    table1.info()
    table2.info()
    table3.info()
}

class Table {
    constructor() {
        legs = 4
        height = 50
    }

    constructor(legsAmount: Int) {
        legs = legsAmount
        height = 50
    }

    constructor(legsAmount: Int, heightValue: Int) {
        legs = legsAmount
        height = heightValue
    }

    var legs: Int? = null
    var height: Int? = null

    fun info() {
        println("This table has $legs legs and height $height cm")
    }
}
