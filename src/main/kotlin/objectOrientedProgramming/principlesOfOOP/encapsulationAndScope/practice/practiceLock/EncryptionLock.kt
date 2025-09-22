package objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.practice.practiceLock

class EncryptionLock(private val privateKey: Int) {
    fun unlock(publicKey: Int) = formula(publicKey) == privateKey

    private fun formula(publicKey: Int) = publicKey / 2 + 5
}
