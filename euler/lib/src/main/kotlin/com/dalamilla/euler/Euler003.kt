/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package com.dalamilla.euler

/**
 * Class for the solution of third Euler problem.
 *
 * @author dalamilla
 */
class Euler003 {
    companion object {

        /**
         * Solution of third Euler problem.
         *
         * [n] Value that find max prime factor.
         *
         * @return The largest prime factor.
         */
        fun solution(n: Long): Long {
            var pm: Long = 2
            var n = n

            while (n != 1L) {
                if (n % pm == 0L) {
                    n = n / pm
                } else {
                    pm += 1
                }
            }

            return pm
        }
    }
}
