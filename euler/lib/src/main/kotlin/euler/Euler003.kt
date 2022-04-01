/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */
package euler

/**
 * Solution of third Euler problem.
 * Returns the largest prime factor of [input].
 */
fun euler003(input: Long): Long {
    var pmf: Long = 2
    var i = input

    while (i != 1.toLong()) {
        if (i % pmf == 0.toLong()) {
            i /= pmf
        } else {
            pmf += 1
        }
    }

    return pmf
}
