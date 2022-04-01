/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
package euler

/**
 * Solution of first Euler problem.
 * Returns the sum of natural numbers that are multiples of 3 or 5 below [input].
 */
fun euler001(input: Int): Int {
    var sum: Int = 0

    for (i in 0 until input)
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    return sum
}
