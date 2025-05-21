package com.dalamilla.diceroller

/** Dice Class. */
class Dice(private val numSides: Int) {

    /** Simulate a dice roll and return the result. */
    fun roll(): Int {
        return (1..numSides).random()
    }
}
