package com.calculator.test;

import com.calculator.functions.CalculatorFunctions;
import com.calculator.functions.CalculatorFunctionsImplFactory;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Unit tests for calculator operations
 * TDD approach to develop the arithmetic operations of a calculator
 */
public class TestCalculatorFunctions {

    private final CalculatorFunctions calculatorFunctions = CalculatorFunctionsImplFactory.createCalculatorFunctionsImpl();

    @Test
    void testAddition() {
        BigDecimal sum = BigDecimal.TEN;
        assertEquals(sum, calculatorFunctions.doCalculation(new BigDecimal("4"), "+", new BigDecimal("6")));
    }

    @Test
    void testAdditionWithInvalidOperation() {
        assertEquals(null, calculatorFunctions.doCalculation(new BigDecimal("4"), "&", new BigDecimal("11")));
    }

    @Test
    void testAdditionWithInvalidOperands() {
        try {
            calculatorFunctions.doCalculation(new BigDecimal("a"), "+", new BigDecimal("b"));
        } catch (NumberFormatException e) {
            assertEquals("java.lang.NumberFormatException", e.toString());
        }
    }

    @Test
    void testSubtraction() {
        BigDecimal subtractionValue = new BigDecimal("1.09");
        assertEquals(subtractionValue, calculatorFunctions.doCalculation(new BigDecimal("9.99"), "-", new BigDecimal("8.90")));
    }

    @Test
    void testSubtractionWithInvalidOperation() {
        assertEquals(null, calculatorFunctions.doCalculation(new BigDecimal("99"), "$", new BigDecimal("6")));
    }

    @Test
    void testSubtractionWithInvalidOperands() {
        try {
            calculatorFunctions.doCalculation(new BigDecimal("c"), "-", new BigDecimal("d"));
        } catch (NumberFormatException e) {
            assertEquals("java.lang.NumberFormatException", e.toString());
        }
    }

    @Test
    void testMultiplication() {
        BigDecimal multipliedValue = new BigDecimal("27.6");
        assertEquals(multipliedValue, calculatorFunctions.doCalculation(new BigDecimal("4.6"), "*", new BigDecimal("6")));
    }

    @Test
    void testMultiplicationWithInvalidOperation() {
        assertEquals(null, calculatorFunctions.doCalculation(new BigDecimal("4"), "%", new BigDecimal("6")));
    }

    @Test
    void testMultiplicationWithInvalidOperands() {
        try {
            calculatorFunctions.doCalculation(new BigDecimal("("), "*", new BigDecimal(")"));
        } catch (NumberFormatException e) {
            assertEquals("java.lang.NumberFormatException", e.toString());
        }
    }

    @Test
    void testDivision() {
        BigDecimal dividedValue = new BigDecimal("1.50");
        assertEquals(dividedValue, calculatorFunctions.doCalculation(new BigDecimal("6"), "/", new BigDecimal("4")));
    }

    @Test
    void testDivisionWithInvalidOperation() {
        assertEquals(null, calculatorFunctions.doCalculation(new BigDecimal("4"), "#", new BigDecimal("6")));
    }

    @Test
    void testDivisionWithInvalidOperands() {
        try {
            calculatorFunctions.doCalculation(new BigDecimal("KLJ"), "/", new BigDecimal("LLL"));
        } catch (NumberFormatException e) {
            assertEquals("java.lang.NumberFormatException", e.toString());
        }
    }
}
