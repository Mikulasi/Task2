package com.epam.task2.yakovlevnn;

import org.junit.Assert;
import org.junit.Test;

public class CalculateFormulaTest extends CalculateMain {

    @Test
    public void testCalculator() {

        CalculateFormula calculateFormula = new CalculateFormula();

        Assert.assertEquals(-14.38,calculateFormula.calculator(2,2,2),0.01);
        Assert.assertEquals(-79.38,calculateFormula.calculator(3,3,3),0.01);
        Assert.assertEquals(Double.POSITIVE_INFINITY,calculateFormula.calculator(0,3,3),0.01);
        Assert.assertEquals(Double.NaN,calculateFormula.calculator(2147483647,3,3),0.01);
        Assert.assertEquals(-2.9710560901343952E28,calculateFormula.calculator(2147483647,-256645,3),0.001);

    }
}