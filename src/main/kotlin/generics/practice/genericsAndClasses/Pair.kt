package generics.practice.genericsAndClasses

class Pair<A, B>(val first: A, val second: B) {
    fun swap(): Pair<B, A> {
        return Pair(second, first)
    }
}
