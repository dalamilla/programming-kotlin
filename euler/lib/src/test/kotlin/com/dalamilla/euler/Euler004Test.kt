package com.dalamilla.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

/** Unit test for fourth Euler problem. */
class Euler004Test {

  /** Test solution. */
  @TestFactory
  fun test() =
    listOf(2 to 9009, 3 to 906609).map { (input, expected) ->
      DynamicTest.dynamicTest(
        "The largest palindrome made from the product of two $input-digit numbers: $expected"
      ) {
        Assertions.assertEquals(expected, Euler004.solution(input))
      }
    }
}
