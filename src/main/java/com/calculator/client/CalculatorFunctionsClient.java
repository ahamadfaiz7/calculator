package com.calculator.client;

import com.calculator.functions.CalculatorFunctions;
import com.calculator.functions.CalculatorFunctionsImplFactory;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorFunctionsClient {
    /**
     * Main method to do calculations based on the inputted operands and operation
     */
    public static void main(String[] args) {
        CalculatorFunctions calculatorFunctions = CalculatorFunctionsImplFactory.createCalculatorFunctionsImpl();
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input the first number/decimal :");
            BigDecimal operand1 = scan.nextBigDecimal();

            System.out.print("Input any one of these operations to be done ('+' | '-' | '*' | '/') :");
            String operation = scan.next();

            System.out.print("Input the second number/decimal :");
            BigDecimal operand2 = scan.nextBigDecimal();
            if (calculatorFunctions.doCalculation(operand1, operation, operand2) == null) {
                System.out.println("Operation not supported"+ "\n" + "Process terminating...");
                return;
            }
            System.out.println("Result is " + calculatorFunctions.doCalculation(operand1, operation, operand2));
        } catch (InputMismatchException e) {
            System.out.print("Invalid input. Please enter a valid number/decimal" + "\n" + "Process terminating...");
        }
    }
}
