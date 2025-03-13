/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

package com.dalamilla.euler

/**
 * Class for the solution of first Euler problem.
 *
 * @author dalamilla
 */
class Euler001 {
  companion object {

    /**
     * Solution of first Euler problem.
     *
     * [n] Value that limit the sum of natural numbers.
     *
     * @return Sum of natural numbers that are multiples of 3 or 5 below n.
     */
    fun solution(n: Int): Int {
      return (1..n - 1).filter { it % 3 == 0 || it % 5 == 0 }.sum()
    }
  }
}
