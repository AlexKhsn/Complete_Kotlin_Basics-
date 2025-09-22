package objectOrientedProgramming.interfaces.practice.restaurant

class LocalRestaurant : Restaurant {
    override fun provideFood() {
        println("Your local restaurant provides food and drinks")
    }

    override fun provideBill() {
        println("Please pay 25")
    }
}
