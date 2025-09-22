package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceGameCharacters

class Warrior(
    override val name: String,
    override var level: Int,
    val weaponDamage: Int,
) : Character() {
    override fun attack(): Int {
        super.attack()
        return weaponDamage * level
    }

    override fun introduce() {
        super.introduce()
        println("Это воин")
    }
}
