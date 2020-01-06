package com.kp.bowlinggame

import org.junit.Assert
import org.junit.Test
import java.lang.Exception

class BowlingGameTest {

    @Test
    @Throws(Exception::class)
    fun testGutterGame() {
        val bowlingGame = BowlingGame()
        for(i in 0 until 20){
            bowlingGame.roll(0)
        }
        Assert.assertEquals(0, bowlingGame.score())
    }
}