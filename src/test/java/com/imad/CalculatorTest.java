package com.imad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.add(5, 3);

        assertEquals(8, actualResult);
    }
}
