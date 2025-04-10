/*
 * A palindromic number reads the same both ways. The largest palindrome made from
 * the product of two 2-startDigit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-startDigit numbers.
 */

package com.dalamilla.euler

/**
 * Class for the solution of fourth Euler problem.
 *
 * @author dalamilla
 */
class Euler004 {
    companion object {

        /**
         * Solution of fourth Euler problem.
         *
         * [n] Value of n-startDigit numbers.
         *
         * @return The largest palindrome made from the product of two n-startDigit numbers.
         */
        fun solution(n: Int): Int {
            return genProductList(n).filter { isPalindrome(it) }.max()
        }

        /** Helper function for fourth Euler problem. */
        fun genProductList(n: Int): List<Int> {
            val list = ArrayList<Int>()

            for (i in (pow(10, n - 1)..pow(10, n))) {
                for (j in (pow(10, n - 1)..pow(10, n))) {
                    list.add(i * j)
                }
            }

            return list
        }

        /** Helper function for fourth Euler problem. */
        fun pow(base: Int, exponent: Int): Int {
            if (exponent != 0) {
                return base * pow(base, exponent - 1)
            } else {
                return 1
            }
        }

        /** Helper function for fourth Euler problem. */
        fun isPalindrome(n: Int): Boolean {
            return n.toString() == n.toString().reversed()
        }
    }
}
