package com.calculator.operation;

import java.math.BigDecimal;

/**
 * This class implements the Operation interface and returns the subtraction of operands inputted
 */
public class Subtraction implements Operation{
    @Override
    public BigDecimal calculateResult(BigDecimal operand1, BigDecimal operand2) {
        return operand1.subtract(operand2);
    }
}
