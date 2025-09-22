package objectOrientedProgramming.interfaces.practice.restaurant

class FancyRestaurant : Restaurant {
    override fun provideFood() {
        println("This is the most delicious food")
    }

    override fun provideBill() {
        println("Please pay 100")
    }
}
