package com.calculator.operation;

import java.math.BigDecimal;

/**
 * Interface for calculator operations
 */
public interface Operation {
    BigDecimal calculateResult(BigDecimal operand1, BigDecimal operand2);
}
