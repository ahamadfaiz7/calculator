package com.calculator.functions;

import java.math.BigDecimal;
/**
 * Public interface used to access calculator functions
 */
public interface CalculatorFunctions {
    /**
     * abstract method for calculations
     */
    BigDecimal doCalculation(BigDecimal operand1, String operation, BigDecimal operand2);

}
