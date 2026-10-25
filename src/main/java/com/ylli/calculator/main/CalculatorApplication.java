package com.ylli.calculator.main;

import com.ylli.calculator.exception.DivisionByZeroException;
import com.ylli.calculator.service.CalculatorService;

public class CalculatorApplication {

    public static void main(String[] args) {

        CalculatorService calculator =
                new CalculatorService();

        System.out.println(
                "Addition: "
                + calculator.add(10, 5));

        System.out.println(
                "Subtraction: "
                + calculator.subtract(10, 5));

        System.out.println(
                "Multiplication: "
                + calculator.multiply(10, 5));

        try {

            System.out.println(
                    "Division: "
                    + calculator.divide(10, 0));

        } catch (DivisionByZeroException e) {

            System.out.println(e.getMessage());
        }
    }}
