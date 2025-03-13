package com.dalamilla.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

/** Unit test for fifth Euler problem. */
class Euler005Test {

  /** Test solution. */
  @TestFactory
  fun test() =
    listOf(5 to 60, 7 to 420, 10 to 2520, 13 to 360360, 20 to 232792560).map { (input, expected) ->
      DynamicTest.dynamicTest(
        "The smallest positive number that is evenly divisible by all of the numbers from 1 to $input: $expected"
      ) {
        Assertions.assertEquals(expected, Euler005.solution(input))
      }
    }
}
