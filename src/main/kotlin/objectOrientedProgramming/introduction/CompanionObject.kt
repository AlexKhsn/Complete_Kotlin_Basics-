package objectOrientedProgramming.introduction

fun main() {
    println(Car1.getDrivingInstructions())
}

class Car1 {
    companion object {
        fun getDrivingInstructions(): String {
            return "Drive carefully"
        }
    }
}
