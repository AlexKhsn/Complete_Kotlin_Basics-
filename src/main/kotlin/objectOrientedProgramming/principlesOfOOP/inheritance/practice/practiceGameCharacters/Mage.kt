package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceGameCharacters

class Mage(
    override val name: String,
    override var level: Int,
    val spellPower: Int,
) : Character() {
    override fun attack(): Int {
        super.attack()
        return spellPower + (level * 2)
    }

    fun heal(target: Character, amount: Int) {
        println("$name лечит ${target.name}")
        target.health += amount
    }
}
