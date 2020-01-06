package com.kp.bowlinggame

import java.lang.Exception

class BowlingGameTest {

    @Throws(Exception::class)
    fun testGutterGame() {
        val bowlingGame = BowlingGame()
        for(i in 0 until 20){
            bowlingGame.roll(0)
        }
    }
}