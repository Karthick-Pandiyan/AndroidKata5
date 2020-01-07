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
        val limit = 20
        val pins = 0
        rollMany(limit, pins)
        Assert.assertEquals(0, bowlingGame.score())
    }

    @Test
    @Throws(Exception::class)
    fun testAllOnes() {
        rollMany(20, 1)
        assertEquals(20, bowlingGame.score())
    }

//    @Test
//    @Throws(Exception::class)
//    fun testOneSpare() {
//        bowlingGame.roll(5)
//        bowlingGame.roll(5) // spare
//        bowlingGame.roll(3)
//        rollMany(17, 0)
//        assertEquals(16, bowlingGame.score())
//    }


    private fun rollMany(limit: Int, pins: Int) {
        for (i in 0 until limit)
            bowlingGame.roll(pins)
    }
}