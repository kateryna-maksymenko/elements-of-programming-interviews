package org.epam.math.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator service;

    @Before
    public void setUp() {
        service = new Calculator();
    }

    @Test
    public void shouldReturnThreeWhenAddOneAndTwo() {
        // arrange
        Integer value1 = 1;
        Integer value2 = 2;
        Integer expectedResult = 3;
        //act
        Integer actualResult = service.add(value1, value2);
        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnTwoWhenSubtractThreeAndOne() {
        //arrange
        Integer expectedResult = 2;
        //act
        Integer actualResult = service.subtract(3, 1);
        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
