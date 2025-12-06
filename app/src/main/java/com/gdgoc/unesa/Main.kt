package com.gdgoc.unesa

/**
 * Kotlin Fundamentals Code Test
 * Complete the following functions to make the unit tests pass.
 */
class KotlinFundamentalsTest {

    // ======================
    // 1. VARIABLES
    // ======================

    /**
     * Create a function that declares and returns the sum of two integers.
     * Practice: val, var, and basic types
     */
    fun sumTwoNumbers(a: Int, b: Int): Int {
        // TODO: Implement this function
        return 0
    }

    /**
     * Create a function that concatenates firstName and lastName with a space.
     * Practice: String type and concatenation
     */
    fun getFullName(firstName: String, lastName: String): String {
        // TODO: Implement this function
        return ""
    }

    /**
     * Create a function that converts temperature from Celsius to Fahrenheit.
     * Formula: F = C * 9/5 + 32
     * Practice: Double type and arithmetic operations
     */
    fun celsiusToFahrenheit(celsius: Double): Double {
        // TODO: Implement this function
        return 0.0
    }

    // ======================
    // 2. FUNCTIONS
    // ======================

    /**
     * Create a function that calculates the area of a rectangle.
     * Practice: Function with multiple parameters and return value
     */
    fun calculateRectangleArea(width: Int, height: Int): Int {
        // TODO: Implement this function
        return 0
    }

    /**
     * Create a function with default parameters.
     * If discount is not provided, use 0.0
     * Return the final price after discount (price - price * discount)
     * Practice: Default parameters
     */
    fun calculatePrice(price: Double, discount: Double = 0.0): Double {
        // TODO: Implement this function
        return 0.0
    }

    /**
     * Create a function that returns multiple values using Pair.
     * Return both quotient and remainder of a division.
     * Practice: Returning Pair
     */
    fun divideWithRemainder(dividend: Int, divisor: Int): Pair<Int, Int> {
        // TODO: Implement this function
        return Pair(0, 0)
    }

    // ======================
    // 3. CONDITIONALS
    // ======================

    /**
     * Create a function that returns the grade based on score:
     * 90-100: "A"
     * 80-89: "B"
     * 70-79: "C"
     * 60-69: "D"
     * Below 60: "F"
     * Practice: if-else conditions
     */
    fun getGrade(score: Int): String {
        // TODO: Implement this function
        return ""
    }

    /**
     * Create a function that checks if a number is positive, negative, or zero.
     * Return "Positive", "Negative", or "Zero"
     * Practice: when expression
     */
    fun checkNumber(number: Int): String {
        // TODO: Implement this function
        return ""
    }

    /**
     * Create a function that determines if a year is a leap year.
     * A leap year is divisible by 4, except for years divisible by 100
     * unless they are also divisible by 400.
     * Practice: Complex conditional logic
     */
    fun isLeapYear(year: Int): Boolean {
        // TODO: Implement this function
        return false
    }

    // ======================
    // 4. LOOPS
    // ======================

    /**
     * Create a function that returns the factorial of a number using a loop.
     * Example: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
     * Practice: for loop and range
     */
    fun factorial(n: Int): Long {
        // TODO: Implement this function
        return 0L
    }

    /**
     * Create a function that counts how many even numbers are in a range.
     * Practice: for loop with condition
     */
    fun countEvenNumbers(start: Int, end: Int): Int {
        // TODO: Implement this function
        return 0
    }

    /**
     * Create a function that returns the sum of all numbers from 1 to n.
     * Practice: while loop
     */
    fun sumUpToN(n: Int): Int {
        // TODO: Implement this function
        return 0
    }

    // ======================
    // 5. LISTS
    // ======================

    /**
     * Create a function that returns the sum of all elements in a list.
     * Practice: List iteration and accumulation
     */
    fun sumList(numbers: List<Int>): Int {
        // TODO: Implement this function
        return 0
    }

    /**
     * Create a function that filters out all odd numbers from a list.
     * Return a list with only even numbers.
     * Practice: List filtering
     */
    fun filterEvenNumbers(numbers: List<Int>): List<Int> {
        // TODO: Implement this function
        return emptyList()
    }

    /**
     * Create a function that returns a list of squares of input numbers.
     * Example: [1, 2, 3] -> [1, 4, 9]
     * Practice: List mapping
     */
    fun squareNumbers(numbers: List<Int>): List<Int> {
        // TODO: Implement this function
        return emptyList()
    }

    /**
     * Create a function that finds the maximum number in a list.
     * Return null if the list is empty.
     * Practice: List operations and nullable types
     */
    fun findMax(numbers: List<Int>): Int? {
        // TODO: Implement this function
        return null
    }

    // ======================
    // 6. SETS
    // ======================

    /**
     * Create a function that removes duplicates from a list using Set.
     * Practice: Converting List to Set and back
     */
    fun removeDuplicates(numbers: List<Int>): List<Int> {
        // TODO: Implement this function
        return emptyList()
    }

    /**
     * Create a function that returns the union of two sets.
     * Practice: Set operations
     */
    fun unionSets(set1: Set<Int>, set2: Set<Int>): Set<Int> {
        // TODO: Implement this function
        return emptySet()
    }

    /**
     * Create a function that returns the intersection of two sets.
     * (Elements present in both sets)
     * Practice: Set intersection
     */
    fun intersectSets(set1: Set<Int>, set2: Set<Int>): Set<Int> {
        // TODO: Implement this function
        return emptySet()
    }

    // ======================
    // 7. MAPS
    // ======================

    /**
     * Create a function that counts the frequency of each word in a list.
     * Example: ["apple", "banana", "apple"] -> {"apple": 2, "banana": 1}
     * Practice: Map creation and manipulation
     */
    fun wordFrequency(words: List<String>): Map<String, Int> {
        // TODO: Implement this function
        return emptyMap()
    }

    /**
     * Create a function that returns a map of student names to their grades.
     * Given two lists of equal length: names and scores.
     * Practice: Creating maps from lists
     */
    fun createGradeBook(names: List<String>, scores: List<Int>): Map<String, Int> {
        // TODO: Implement this function
        return emptyMap()
    }

    /**
     * Create a function that returns the total value of items in a shopping cart.
     * Given a map of item names to prices and a map of item names to quantities.
     * Practice: Map operations and calculations
     */
    fun calculateCartTotal(prices: Map<String, Double>, quantities: Map<String, Int>): Double {
        // TODO: Implement this function
        return 0.0
    }

    /**
     * Create a function that inverts a map (swap keys and values).
     * Assume all values are unique.
     * Practice: Map transformation
     */
    fun invertMap(map: Map<String, Int>): Map<Int, String> {
        // TODO: Implement this function
        return emptyMap()
    }
}