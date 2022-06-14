package com.karazina.math;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NumericalIntegration {

    private static final int intervalSegments = 10;

    private static double function(double x) {
        return (x - 1.8f) / (Math.pow(x, 4) + 5.1f);
    }

    public static double rectangleIntegrationMethod(double a, double b) {
        double res = 0.0;
        double h = countStep(a, b);

        for (double i = a; i < b; i += h) {
            res += function(i + h / 2);
        }
        System.out.println("h = " + h);
        return Math.abs(res * h);
    }

    public static double trapezeIntegrationMethod(double a, double b) {
        double res = 0.0;
        double h = countStep(a, b);

        double k = function(a) + function(b);

        for (double i = a + h; i < b; i += h) {
            res += function(i);
        }
        System.out.println("h = " + h);
        return Math.abs(h * (res + k / 2));
    }

    public static double simpsonIntegrationMethod(double a, double b) {
        double sum1 = 0.0, sum2 = 0.0;
        double h = countStep(a, b);

        double k = function(a) + function(b);

        for (double i = a + h, j = 0; i < b; i += h, j++) {
            if (j % 2 == 0) {
                sum1 += function(i);
            } else {
                sum2 += function(i);
            }
        }
        System.out.println("h = " + h);
        return Math.abs((h / 3) * (k + sum1 * 4 + sum2 * 2));
    }

    private static double countStep(double a, double b) {
        return (b - a) / intervalSegments;
    }

}
