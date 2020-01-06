package com.kp.bowlinggame

import junit.framework.TestCase.assertEquals
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

    @Test
    @Throws(Exception::class)
    fun testAllOnes() {
        val bowlingGame = BowlingGame()
        for (i in 0..19)
            bowlingGame.roll(1)
        assertEquals(20, bowlingGame.score())
    }
}