package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceTools

class Hammer(
    override val name: String,
    override val material: String,
) : Tool() {
    override fun use() {
        println("Забиваю гвозди молотком из $material")
        super.use()
    }
}
