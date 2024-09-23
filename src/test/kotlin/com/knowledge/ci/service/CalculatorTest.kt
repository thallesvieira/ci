package com.knowledge.ci.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest{
    private val calculator = Calculator()

    @Test
    fun testSum() {
        assertEquals(calculator.sum(2, 2), 4)
        assertEquals(calculator.sum(3, 3), 6)
        assertEquals(calculator.sum(4, 4), 8)
    }

    @Test
    fun testSubtraction() {
        assertEquals(calculator.subtraction(2, 1), 1)
        assertEquals(calculator.subtraction(3, 3), 0)
        assertEquals(calculator.subtraction(4, 5), -1)
    }

    @Test
    fun testMultiplication() {
        assertEquals(calculator.multiplication(2, 2), 4)
        assertEquals(calculator.multiplication(3, 3), 9)
        assertEquals(calculator.multiplication(4, 4), 16)
    }
}