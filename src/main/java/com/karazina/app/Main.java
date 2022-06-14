package com.karazina.app;

import com.karazina.math.NumericalIntegration;

public class Main {

    public static void main(String[] args) {
        double lowerValue = 0, upperValue = 1.2f;
        System.out.println("Rectangle integration method ");
        System.out.println("Result: " + NumericalIntegration.rectangleIntegrationMethod(lowerValue, upperValue));
        System.out.println("--------------");
        System.out.println("Trapeze integration method ");
        System.out.println("Result: " + NumericalIntegration.trapezeIntegrationMethod(lowerValue, upperValue));
        System.out.println("--------------");
        System.out.println("Simpson integration method ");
        System.out.println("Result: " + NumericalIntegration.simpsonIntegrationMethod(lowerValue, upperValue));
    }

}
