package functions.functionsBeginner

fun main() {
    for (i in 1..3) {
        hello()
    }

    var i = 5

    do {
        printAnAlphabet()
        i--
    } while (i > 0)
}

fun hello() {
    println("Hello everyone!")
}

fun printAnAlphabet() {
    println("a, b, c, d, e, f, g, h, i, g, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z")
}
