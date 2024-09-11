package com.knowledge.ci.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest{
    private val calculator = Calculator()

    @Test
    fun testSum() {
        assertEquals(calculator.sum(2, 2), 4)
    }
}