This application is a prototype to perform calculator arithmetic operations and display the results in the console.
This has been implemented using TDD methodology of agile.

In the first iteration
---------------------
1. A unit test **testAddition** was first written to test the addition of two numbers/decimals.
2. A skeleton interface was created with abstract method BigDecimal doCalculation(BigDecimal operand1, String operation, BigDecimal operand2);
3. The interface was inherited in the class CalculatorFunctionsImpl
4. The class CalculatorFunctionsImpl didn't implement any logic to do calculation, and returned null for all inputs.
5. The unit test **testAddition** was executed to call the doCalculation  function with + operation, and it failed because the implementation class was returning null as there was no implementation and was returning null for every input.

In the second iteration
---------------------
1. The logic to add two numbers was then implemented and the code was refactored.
2. The test case was executed repeatedly with various inputs until the valid output was returned with the valid inputs.


In the latter cycles 
---------------------
1. Other junit tests were written to test the accuracy of addition operation, and it's behavior on invalid inputs.
2. The implementation of addition operation was properly implemented and tested. 
3. Later the same methodology was used and iterative implementation was done to develop subtract, multiplication and division functions of calculator.

