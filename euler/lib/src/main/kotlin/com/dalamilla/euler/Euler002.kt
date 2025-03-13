/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 *                     1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 */

package com.dalamilla.euler

/**
 * Class for the solution of second Euler problem.
 *
 * @author dalamilla
 */
class Euler002 {
  companion object {

    /**
     * Solution of second Euler problem.
     *
     * [n] Value that limit the sum of Fibonacci numbers.
     *
     * @return Sum of even Fibonacci numbers below n.
     */
    fun solution(n: Int): Int {
      val fibsequence =
        generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }
      return fibsequence.takeWhile { it <= n }.filter { it % 2 == 0 }.sum()
    }
  }
}
