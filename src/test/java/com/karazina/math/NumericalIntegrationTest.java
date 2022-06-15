package com.karazina.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumericalIntegrationTest {

    private static final double EXPECTED_RESULT = 0.269;
    private static final double DELTA = 1;

    private double lowerValue = 0;
    private double upperValue = 1.2f;

    @DisplayName("Rectangle integration method test")
    @Test
    void rectangleIntegrationMethod() {
        double actualResult = NumericalIntegration.rectangleIntegrationMethod(lowerValue, upperValue);
        assertEquals(EXPECTED_RESULT, actualResult, DELTA);
    }

    @DisplayName("Trapeze integration method test")
    @Test
    void trapezeIntegrationMethod() {
        double actualResult = NumericalIntegration.trapezeIntegrationMethod(lowerValue, upperValue);
        assertEquals(EXPECTED_RESULT, actualResult);
    }

    @DisplayName("Simpson integration method test")
    @Test
    void simpsonIntegrationMethod() {
        double actualResult = NumericalIntegration.simpsonIntegrationMethod(lowerValue, upperValue);
        assertEquals(EXPECTED_RESULT, actualResult);
    }

}