package com.gdgoc.unesa

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

/**
 * Unit tests for Kotlin Fundamentals Code Test
 * These tests verify that all implementations are correct.
 */
class KotlinFundamentalsUnitTest {

    private lateinit var test: KotlinFundamentalsTest

    @Before
    fun setup() {
        test = KotlinFundamentalsTest()
    }

    // ======================
    // 1. VARIABLES TESTS
    // ======================

    @Test
    fun testSumTwoNumbers() {
        assertEquals(5, test.sumTwoNumbers(2, 3))
        assertEquals(0, test.sumTwoNumbers(-5, 5))
        assertEquals(-10, test.sumTwoNumbers(-3, -7))
        assertEquals(100, test.sumTwoNumbers(50, 50))
    }

    @Test
    fun testGetFullName() {
        assertEquals("John Doe", test.getFullName("John", "Doe"))
        assertEquals("Jane Smith", test.getFullName("Jane", "Smith"))
        assertEquals("A B", test.getFullName("A", "B"))
    }

    @Test
    fun testCelsiusToFahrenheit() {
        assertEquals(32.0, test.celsiusToFahrenheit(0.0), 0.01)
        assertEquals(212.0, test.celsiusToFahrenheit(100.0), 0.01)
        assertEquals(98.6, test.celsiusToFahrenheit(37.0), 0.01)
        assertEquals(-40.0, test.celsiusToFahrenheit(-40.0), 0.01)
    }

    // ======================
    // 2. FUNCTIONS TESTS
    // ======================

    @Test
    fun testCalculateRectangleArea() {
        assertEquals(20, test.calculateRectangleArea(4, 5))
        assertEquals(100, test.calculateRectangleArea(10, 10))
        assertEquals(0, test.calculateRectangleArea(0, 5))
        assertEquals(50, test.calculateRectangleArea(25, 2))
    }

    @Test
    fun testCalculatePrice() {
        assertEquals(100.0, test.calculatePrice(100.0), 0.01)
        assertEquals(90.0, test.calculatePrice(100.0, 0.1), 0.01)
        assertEquals(50.0, test.calculatePrice(100.0, 0.5), 0.01)
        assertEquals(0.0, test.calculatePrice(100.0, 1.0), 0.01)
    }

    @Test
    fun testDivideWithRemainder() {
        assertEquals(Pair(3, 1), test.divideWithRemainder(10, 3))
        assertEquals(Pair(5, 0), test.divideWithRemainder(20, 4))
        assertEquals(Pair(2, 1), test.divideWithRemainder(7, 3))
        assertEquals(Pair(0, 5), test.divideWithRemainder(5, 10))
    }

    // ======================
    // 3. CONDITIONALS TESTS
    // ======================

    @Test
    fun testGetGrade() {
        assertEquals("A", test.getGrade(95))
        assertEquals("A", test.getGrade(90))
        assertEquals("B", test.getGrade(85))
        assertEquals("B", test.getGrade(80))
        assertEquals("C", test.getGrade(75))
        assertEquals("D", test.getGrade(65))
        assertEquals("F", test.getGrade(50))
        assertEquals("F", test.getGrade(0))
    }

    @Test
    fun testCheckNumber() {
        assertEquals("Positive", test.checkNumber(5))
        assertEquals("Negative", test.checkNumber(-5))
        assertEquals("Zero", test.checkNumber(0))
        assertEquals("Positive", test.checkNumber(100))
        assertEquals("Negative", test.checkNumber(-1))
    }

    @Test
    fun testIsLeapYear() {
        assertTrue(test.isLeapYear(2020))
        assertFalse(test.isLeapYear(2021))
        assertTrue(test.isLeapYear(2000))
        assertFalse(test.isLeapYear(1900))
        assertTrue(test.isLeapYear(2024))
        assertFalse(test.isLeapYear(2100))
        assertTrue(test.isLeapYear(2400))
    }

    // ======================
    // 4. LOOPS TESTS
    // ======================

    @Test
    fun testFactorial() {
        assertEquals(1L, test.factorial(0))
        assertEquals(1L, test.factorial(1))
        assertEquals(2L, test.factorial(2))
        assertEquals(6L, test.factorial(3))
        assertEquals(24L, test.factorial(4))
        assertEquals(120L, test.factorial(5))
        assertEquals(720L, test.factorial(6))
    }

    @Test
    fun testCountEvenNumbers() {
        assertEquals(5, test.countEvenNumbers(1, 10))
        assertEquals(50, test.countEvenNumbers(1, 100))
        assertEquals(0, test.countEvenNumbers(1, 1))
        assertEquals(1, test.countEvenNumbers(2, 2))
        assertEquals(3, test.countEvenNumbers(5, 10))
    }

    @Test
    fun testSumUpToN() {
        assertEquals(0, test.sumUpToN(0))
        assertEquals(1, test.sumUpToN(1))
        assertEquals(3, test.sumUpToN(2))
        assertEquals(6, test.sumUpToN(3))
        assertEquals(10, test.sumUpToN(4))
        assertEquals(55, test.sumUpToN(10))
        assertEquals(5050, test.sumUpToN(100))
    }

    // ======================
    // 5. LISTS TESTS
    // ======================

    @Test
    fun testSumList() {
        assertEquals(15, test.sumList(listOf(1, 2, 3, 4, 5)))
        assertEquals(0, test.sumList(listOf()))
        assertEquals(10, test.sumList(listOf(10)))
        assertEquals(0, test.sumList(listOf(-5, 5)))
        assertEquals(100, test.sumList(listOf(25, 25, 25, 25)))
    }

    @Test
    fun testFilterEvenNumbers() {
        assertEquals(listOf(2, 4, 6), test.filterEvenNumbers(listOf(1, 2, 3, 4, 5, 6)))
        assertEquals(emptyList<Int>(), test.filterEvenNumbers(listOf(1, 3, 5)))
        assertEquals(listOf(2, 4), test.filterEvenNumbers(listOf(2, 4)))
        assertEquals(emptyList<Int>(), test.filterEvenNumbers(emptyList()))
    }

    @Test
    fun testSquareNumbers() {
        assertEquals(listOf(1, 4, 9, 16, 25), test.squareNumbers(listOf(1, 2, 3, 4, 5)))
        assertEquals(emptyList<Int>(), test.squareNumbers(emptyList()))
        assertEquals(listOf(100), test.squareNumbers(listOf(10)))
        assertEquals(listOf(0, 1, 4), test.squareNumbers(listOf(0, 1, 2)))
    }

    @Test
    fun testFindMax() {
        assertEquals(5, test.findMax(listOf(1, 2, 3, 4, 5)))
        assertEquals(null, test.findMax(listOf()))
        assertEquals(100, test.findMax(listOf(100)))
        assertEquals(10, test.findMax(listOf(-5, 0, 10, 5)))
        assertEquals(-1, test.findMax(listOf(-10, -5, -1)))
    }

    // ======================
    // 6. SETS TESTS
    // ======================

    @Test
    fun testRemoveDuplicates() {
        assertEquals(listOf(1, 2, 3, 4, 5), test.removeDuplicates(listOf(1, 2, 2, 3, 3, 3, 4, 5, 5)))
        assertEquals(listOf(1), test.removeDuplicates(listOf(1, 1, 1, 1)))
        assertEquals(emptyList<Int>(), test.removeDuplicates(emptyList()))
        // Note: Order might vary with Set, so we'll use sorted comparison
        val result = test.removeDuplicates(listOf(5, 1, 3, 1, 5, 2))
        assertEquals(listOf(1, 2, 3, 5), result.sorted())
    }

    @Test
    fun testUnionSets() {
        assertEquals(setOf(1, 2, 3, 4, 5), test.unionSets(setOf(1, 2, 3), setOf(3, 4, 5)))
        assertEquals(setOf(1, 2, 3), test.unionSets(setOf(1, 2, 3), setOf()))
        assertEquals(emptySet<Int>(), test.unionSets(setOf(), setOf()))
        assertEquals(setOf(1, 2, 3, 4), test.unionSets(setOf(1, 2), setOf(3, 4)))
    }

    @Test
    fun testIntersectSets() {
        assertEquals(setOf(3), test.intersectSets(setOf(1, 2, 3), setOf(3, 4, 5)))
        assertEquals(emptySet<Int>(), test.intersectSets(setOf(1, 2), setOf(3, 4)))
        assertEquals(setOf(1, 2, 3), test.intersectSets(setOf(1, 2, 3), setOf(1, 2, 3)))
        assertEquals(emptySet<Int>(), test.intersectSets(setOf(), setOf(1, 2)))
    }

    // ======================
    // 7. MAPS TESTS
    // ======================

    @Test
    fun testWordFrequency() {
        val result1 = test.wordFrequency(listOf("apple", "banana", "apple", "cherry", "banana", "apple"))
        assertEquals(mapOf("apple" to 3, "banana" to 2, "cherry" to 1), result1)

        val result2 = test.wordFrequency(listOf("test"))
        assertEquals(mapOf("test" to 1), result2)

        val result3 = test.wordFrequency(listOf())
        assertEquals(mapOf<String, Int>(), result3)
    }

    @Test
    fun testCreateGradeBook() {
        val names = listOf("Alice", "Bob", "Charlie")
        val scores = listOf(95, 87, 92)
        val result = test.createGradeBook(names, scores)
        assertEquals(mapOf("Alice" to 95, "Bob" to 87, "Charlie" to 92), result)

        val emptyResult = test.createGradeBook(listOf(), listOf())
        assertEquals(mapOf<String, Int>(), emptyResult)
    }

    @Test
    fun testCalculateCartTotal() {
        val prices = mapOf("apple" to 1.5, "banana" to 0.5, "orange" to 2.0)
        val quantities = mapOf("apple" to 3, "banana" to 5, "orange" to 2)
        assertEquals(11.0, test.calculateCartTotal(prices, quantities), 0.01)

        val emptyTotal = test.calculateCartTotal(mapOf(), mapOf())
        assertEquals(0.0, emptyTotal, 0.01)

        val partialQuantities = mapOf("apple" to 2)
        assertEquals(3.0, test.calculateCartTotal(prices, partialQuantities), 0.01)
    }

    @Test
    fun testInvertMap() {
        val map1 = mapOf("one" to 1, "two" to 2, "three" to 3)
        assertEquals(mapOf(1 to "one", 2 to "two", 3 to "three"), test.invertMap(map1))

        val map2 = mapOf("a" to 10)
        assertEquals(mapOf(10 to "a"), test.invertMap(map2))

        val emptyMap = mapOf<String, Int>()
        assertEquals(mapOf<Int, String>(), test.invertMap(emptyMap))
    }
}