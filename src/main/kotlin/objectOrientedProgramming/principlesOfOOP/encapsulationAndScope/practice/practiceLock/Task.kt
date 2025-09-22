package objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.practice.practiceLock

fun main() {
    val myLock = _root_ide_package_.objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.practice.practiceLock.EncryptionLock(40)

    println("Does the key 40 unlock my lock: ${myLock.unlock(40)}")
    println("Does the key 60 unlock my lock: ${myLock.unlock(60)}")
    println("Does the key 80 unlock my lock: ${myLock.unlock(80)}")
    println("Does the key 34 unlock my lock: ${myLock.unlock(34)}")
    println("Does the key 70 unlock my lock: ${myLock.unlock(70)}")
}
