package objectOrientedProgramming.interfaces

fun main() {
    val child = Child()

    child.raisePet()
}

interface Pet {
    var cutenessLevel: Int

    fun startPlaying()

    fun feed()
}

class Puppy() : Pet {
    override var cutenessLevel = 10

    override fun startPlaying() {
        println("Dog plays")
    }

    override fun feed() {
        println("Give a dog some food")
    }
}

class Child {
    val pet: Pet

    init {
        val petStore = PetStore()
        pet = petStore.getPet()
    }

    fun raisePet() {
        for (i in 1..pet.cutenessLevel) {
            pet.startPlaying()
        }

        pet.feed()
    }
}

class PetStore {
    fun getPet(): Pet {
        return Puppy()
    }
}
