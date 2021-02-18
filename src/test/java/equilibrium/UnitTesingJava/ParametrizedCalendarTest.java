package equilibrium.UnitTesingJava;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ParametrizedCalendarTest
{
    private Calendar testObject = new Calendar();

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
    public void shouldReturnDaysNumberOfGivenYearAndMonth(int year, int month,int expectedResult)
    {
        int result = testObject.DaysNumber(year,month);

        Assertions.assertEquals(expectedResult,result);
    }
}