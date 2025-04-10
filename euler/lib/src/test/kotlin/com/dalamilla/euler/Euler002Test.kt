package com.dalamilla.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

/** Unit test for second Euler problem. */
class Euler002Test {

    /** Test solution. */
    @TestFactory
    fun test() =
        listOf(
                8 to 10,
                10 to 10,
                34 to 44,
                60 to 44,
                1000 to 798,
                100000 to 60696,
                4000000 to 4613732,
            )
            .map { (input, expected) ->
                DynamicTest.dynamicTest(
                    "The sum of even Fibonacci numbers below $input: $expected"
                ) {
                    Assertions.assertEquals(expected, Euler002.solution(input))
                }
            }
}
