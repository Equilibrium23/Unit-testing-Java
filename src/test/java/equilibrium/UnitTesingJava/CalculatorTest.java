package equilibrium.UnitTesingJava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest
{
    @Test
    public void testCalculatorAdd()
    {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 5;
        int expectedResult = 10;

        int result = calculator.add(a,b);

        Assertions.assertEquals(expectedResult,result);
    }

}