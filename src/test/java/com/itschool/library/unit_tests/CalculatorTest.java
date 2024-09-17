package com.itschool.library.unit_tests;

import com.itschool.library.utils.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setup() {
        calculator = new Calculator();
    }

    @Test
    void testAddition_withValidInput_ShouldPass() {
        //given
        int firstNumber = 5;
        int secondNumber = 10;
        int expectResult = firstNumber + secondNumber;

        //when
        int actualResult = calculator.add(firstNumber, secondNumber);

        //then
        assertEquals(expectResult, actualResult, "The addition result should be equal to the expected result");
    }

    @Test
    void testAddition_WithResultExceedsMaximumIntegerValue_ShouldFail() {
        //given
        int a = Integer.MAX_VALUE;
        int b = 1;
        long expectedResult = (long) a + b;

        //when
        int actualResult = calculator.add(a, b);

        //then
        assertNotEquals(expectedResult, actualResult);
    }
}