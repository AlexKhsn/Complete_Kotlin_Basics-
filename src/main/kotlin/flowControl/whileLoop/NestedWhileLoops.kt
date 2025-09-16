package flowControl.whileLoop

fun main() {
    var i = 0
    var j = 0

    while (i <= 10) {
        while (j <= 10) {
            print("$i, $j\t")
            j++
        }
        i++
        j = 0
        println()
    }
}
