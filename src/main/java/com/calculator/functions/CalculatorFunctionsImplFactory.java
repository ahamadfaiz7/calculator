package com.calculator.functions;

public class CalculatorFunctionsImplFactory {

    private CalculatorFunctionsImplFactory() {
    }

    /**
     * Creates an instance of {@link CalculatorFunctionsImplFactory}.
     *
     * @return the new instance of CalculatorFunctionsImpl
     */
    public static CalculatorFunctionsImpl createCalculatorFunctionsImpl() {
        return new CalculatorFunctionsImpl();
    }
}
