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

    @Test
    @Throws(Exception::class)
    fun testOneSpare() {
        rollSpare()
        bowlingGame.roll(3)
        rollMany(17, 0)
        assertEquals(16, bowlingGame.score())
    }

    @Test
    @Throws(Exception::class)
    fun testOneStrike() {
        rollStrike()
        bowlingGame.roll(3)
        bowlingGame.roll(4)
        rollMany(16, 0)
        assertEquals(24, bowlingGame.score())
    }

    @Test
    @Throws(Exception::class)
    fun testPerfectGame() {
        rollMany(12, 10)
        assertEquals(300, bowlingGame.score())
    }

    private fun rollStrike() {
        bowlingGame.roll(10)
    }

    private fun rollSpare() {
        bowlingGame.roll(5)
        bowlingGame.roll(5)
    }


    private fun rollMany(limit: Int, pins: Int) {
        for (i in 0 until limit)
            bowlingGame.roll(pins)
    }
}