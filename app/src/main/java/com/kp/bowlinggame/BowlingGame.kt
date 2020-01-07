package com.kp.bowlinggame



class BowlingGame {
    var score: Int = 0
    private val rolls = IntArray(21)
    private var currentRoll = 0


    fun roll(pins: Int) {
        score += pins
        rolls[currentRoll++] = pins;

    }

    fun score(): Int {
        return score
    }

}