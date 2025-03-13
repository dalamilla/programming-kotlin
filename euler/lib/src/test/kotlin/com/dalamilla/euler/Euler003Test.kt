package com.dalamilla.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

/** Unit test for third Euler problem. */
class Euler003Test {

  /** Test solution. */
  @TestFactory
  fun test() =
    listOf<Pair<Long, Long>>(
        2 to 2,
        3 to 3,
        5 to 5,
        7 to 7,
        8 to 2,
        13195 to 29,
        600851475143 to 6857,
      )
      .map { (input, expected) ->
        DynamicTest.dynamicTest("The largest prime factor of $input: $expected") {
          Assertions.assertEquals(expected, Euler003.solution(input))
        }
      }
}
