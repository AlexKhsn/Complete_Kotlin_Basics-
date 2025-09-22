package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceGameCharacters

fun main() {
    val warrior = Warrior("Warrior", 3, 3)
    val mage = Mage("Mage", 5, 5)

    warrior.introduce()
    mage.introduce()

    mage.takeDamage(warrior.attack())
    mage.takeDamage(warrior.attack())
    mage.introduce()
    warrior.takeDamage(mage.attack())
    warrior.takeDamage(mage.attack())
    warrior.introduce()
    mage.heal(mage, 10)

    warrior.introduce()
    mage.introduce()
}
