/*
 * A palindromic number reads the same both ways. The largest palindrome made from
 * the product of two 2-startDigit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-startDigit numbers.
 */
package euler

import kotlin.math.pow

/**
 * Solution of fourth Euler problem.
 * Returns the largest palindrome made from the product of two [input]-startDigit numbers.
 */
fun euler004(input: Int): Int {
    val starDigit = 10.toDouble().pow(input - 1)
    val endDigit = 10.toDouble().pow(input)

    var largest = 0
    var i = starDigit

    while (i < endDigit) {
        var j = starDigit
        while (j < endDigit) {
            if (isPalindrome((i * j).toInt()) && i * j > largest) {
                largest = (i * j).toInt()
            }
            j += 1
        }
        i += 1
    }
    return largest
}

fun isPalindrome(input: Int): Boolean {
    return input.toString() == input.toString().reversed()
}