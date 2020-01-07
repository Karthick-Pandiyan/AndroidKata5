package com.kp.bowlinggame


@Suppress("DEPRECATED_IDENTITY_EQUALS")
class BowlingGame {
    var score: Int = 0
    private val rolls = IntArray(21)
    private var currentRoll = 0


    fun roll(pins: Int) {
        score += pins
        rolls[currentRoll++] = pins;

    }

    fun score(): Int {
        var score = 0
        var frameIndex = 0
        for (frame in 0..9) {
            if (isSpare(frameIndex))
            {
                score += 10 + rolls[frameIndex + 2]
                frameIndex += 2
            } else {
                score += rolls[frameIndex] + rolls[frameIndex + 1]
                frameIndex += 2
            }
        }
        return score
    }

    private fun isSpare(frameIndex: Int) = rolls[frameIndex] + rolls[frameIndex + 1] === 10

}