package com.kp.bowlinggame

import junit.framework.TestCase.assertEquals
import org.junit.Assert
import org.junit.Test
import java.lang.Exception

class BowlingGameTest {

    private val bowlingGame = BowlingGame()

    @Test
    @Throws(Exception::class)
    fun testGutterGame() {
        for(i in 0 until 20){
            bowlingGame.roll(0)
        }
        Assert.assertEquals(0, bowlingGame.score())
    }

    @Test
    @Throws(Exception::class)
    fun testAllOnes() {
        for (i in 0..19)
            bowlingGame.roll(1)
        assertEquals(20, bowlingGame.score())
    }

    private fun rollMany(n: Int, pins: Int) {
        for (i in 0 until n)
            bowlingGame.roll(pins)
    }
}