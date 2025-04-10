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
        2L to 2L,
        3L to 3L,
        5L to 5L,
        7L to 7L,
        8L to 2L,
        13195L to 29L,
        600851475143L to 6857L,
      )
      .map { (input, expected) ->
        DynamicTest.dynamicTest("The largest prime factor of $input: $expected") {
          Assertions.assertEquals(expected, Euler003.solution(input))
        }
      }
}
