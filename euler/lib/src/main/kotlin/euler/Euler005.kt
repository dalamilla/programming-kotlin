/*
 * 2520 is the smallest number that can be divided by each of
 * the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible
 * by all the numbers from 1 to 20?
 */
package euler

/**
 * Solution of fifth Euler problem.
 * Returns the smallest positive number that is evenly divisible
 *  by all of the numbers from 1 to [input].
 */
fun euler005(input: Int): Int {
    var found = true
    var number = 0

    while (found) {
        var i = 1
        number += input

        while (number % i == 0 && i <= input) {
            if (i == input) {
                found = false
            }
            i += 1
        }
    }
    return number
}
