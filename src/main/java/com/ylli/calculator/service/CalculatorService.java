package com.ylli.calculator.service;

import com.ylli.calculator.exception.DivisionByZeroException;

public class CalculatorService {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b)
            throws DivisionByZeroException {

        if (b == 0) {
            throw new DivisionByZeroException(
                    "Division by zero is not allowed.");
        }

        return a / b;
    }
}