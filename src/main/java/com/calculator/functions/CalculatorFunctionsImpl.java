package com.calculator.functions;

import com.calculator.operation.*;
import java.math.BigDecimal;
import java.util.Objects;
/**
 * Implementation of calculator functions
 */
class CalculatorFunctionsImpl implements CalculatorFunctions {
    /**
     *
     * @param operand1
     * @param operation
     * @param operand2
     * @return
     */
    @Override
    public BigDecimal doCalculation(BigDecimal operand1, String operation, BigDecimal operand2) {
        Operation ops;
        switch (operation) {
            case "+":
                ops = new Addition();
                break;
            case "-":
                ops = new Subtraction();
                break;
            case "*":
                ops = new Multiplication();
                break;
            case "/":
                ops = new Division();
                break;
            default:
                ops = null;
                break;
        }
        if (Objects.nonNull(ops)) {
            return ops.calculateResult(operand1, operand2);
        } else
            return null;
    }
}
