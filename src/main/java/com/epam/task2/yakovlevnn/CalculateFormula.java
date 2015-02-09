package com.epam.task2.yakovlevnn;

import static java.lang.Math.*;

public class CalculateFormula {

    public double calculator(int a, int b, int c){

        double d = b + sqrt(pow(b, 2) + 4 * a * c);
        double e = 2 * a;
        double f = (pow(a, 3)*c);
        double g = (long) pow(b, -2);
        double h = d/e-f+g;
        System.out.println(h);
        return h;
    }
}
