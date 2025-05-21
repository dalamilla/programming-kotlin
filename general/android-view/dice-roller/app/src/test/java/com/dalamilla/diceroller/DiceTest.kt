package com.dalamilla.diceroller

import org.junit.Assert.*
import org.junit.Test

/** Unit test for Dice Class. */
class DiceTest {
    @Test
    fun roll_dice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        assertTrue("Between 1 and 6", (diceRoll >= 1) && (diceRoll <= 6))
    }
}
