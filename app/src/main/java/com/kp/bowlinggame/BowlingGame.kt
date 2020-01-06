package com.kp.bowlinggame

class BowlingGame {
    var score: Int = 0

    fun roll(pins: Int) {
        score += pins
    }

    fun score(): Int {
        return score
    }

}