package com.calculator.operation;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class implements the Operation interface and returns the division of operands inputted
 */
public class Division implements Operation{
    @Override
    public BigDecimal calculateResult(BigDecimal operand1, BigDecimal operand2) {
        return operand1.divide(operand2 ,2, RoundingMode.HALF_UP);
    }
}
