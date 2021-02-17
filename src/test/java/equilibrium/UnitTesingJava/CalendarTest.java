package equilibrium.UnitTesingJava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest
{
    Calendar testObject = new Calendar();
    @Test
    public void test2018June()
    {
        int month = 6;
        int year = 2018;
        int expectedResult = 30;

        int result = testObject.DaysNumber(year,month);

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void test2018July()
    {
        int month = 7;
        int year = 2018;
        int expectedResult = 31;

        int result = testObject.DaysNumber(year,month);

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void test2018August()
    {
        int month = 8;
        int year = 2018;
        int expectedResult = 31;

        int result = testObject.DaysNumber(year,month);

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void test2018February()
    {
        int month = 2;
        int year = 2018;
        int expectedResult = 28;

        int result = testObject.DaysNumber(year,month);

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void test2016February()
    {
        int month = 2;
        int year = 2016;
        int expectedResult = 29;

        int result = testObject.DaysNumber(year,month);

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void test2010February()
    {
        int month = 2;
        int year = 2010;
        int expectedResult = 28;

        int result = testObject.DaysNumber(year,month);

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void test2100February()
    {
        int month = 2;
        int year = 2100;
        int expectedResult = 28;

        int result = testObject.DaysNumber(year,month);

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void test2000February()
    {
        int month = 2;
        int year = 2000;
        int expectedResult = 29;

        int result = testObject.DaysNumber(year,month);

        Assertions.assertEquals(expectedResult,result);
    }
}