package objectOrientedProgramming.principlesOfOOP.polymorphism.practice.tv

class Tv {
    fun show() {
        println("TV shows a random channel")
    }

    fun show(channel: Int) {
        println("Channel $channel shows a program ")
    }

    fun show(channel: Int, info: Boolean) {
        print("Channel $channel shows news ")
        if (info) {
            print("with subtitles")
        } else {
            print("without subtitles")
        }
    }

    fun show(channel: Int, dayTime: Int) {
        when (dayTime) {
            in 0..12 -> println("something on $channel channel from 0 to 12")
            in 13..17 -> println("something on $channel channel from 13 to 17")
            in 18..24 -> println("something on $channel channel from 18 to 24")
        }
    }
}
