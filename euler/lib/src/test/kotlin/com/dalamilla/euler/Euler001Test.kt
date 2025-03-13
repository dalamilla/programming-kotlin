package com.dalamilla.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

/** Unit test for first Euler problem. */
class Euler001Test {

  /** Test solution. */
  @TestFactory
  fun test() =
    listOf(1000 to 233168, 49 to 543, 8456 to 16687353, 19564 to 89301183).map { (input, expected)
      ->
      DynamicTest.dynamicTest("The sum of multiples of 3 or 5 below $input: $expected") {
        Assertions.assertEquals(expected, Euler001.solution(input))
      }
    }
}
