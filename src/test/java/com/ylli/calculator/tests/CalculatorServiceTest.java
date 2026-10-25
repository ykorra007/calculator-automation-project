package com.ylli.calculator.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.ylli.calculator.exception.DivisionByZeroException;
import com.ylli.calculator.service.CalculatorService;

public class CalculatorServiceTest {

    @Test
    public void additionShouldReturnCorrectResult() {

        CalculatorService calculator =
                new CalculatorService();

        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void subtractionShouldReturnCorrectResult() {

        CalculatorService calculator =
                new CalculatorService();

        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void multiplicationShouldReturnCorrectResult() {

        CalculatorService calculator =
                new CalculatorService();

        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void divisionShouldReturnCorrectResult()
            throws DivisionByZeroException {

        CalculatorService calculator =
                new CalculatorService();

        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    public void divisionByZeroShouldThrowException() {

        CalculatorService calculator =
                new CalculatorService();

        assertThrows(
                DivisionByZeroException.class,
                () -> calculator.divide(10, 0)
        );
    }
}