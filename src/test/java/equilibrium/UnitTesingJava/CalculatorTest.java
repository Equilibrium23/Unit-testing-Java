package equilibrium.UnitTesingJava;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest
{
    private Calculator calculator = new Calculator();

    @DisplayName("Add Tests")
    @Nested
    class AddTests
    {
        @DisplayName("5 + 5 = 10")
        @Test
        public void should_add_5_to_5_and_return_10()
        {
            int a = 5;
            int b = 5;
            int expectedResult = 10;

            int result = calculator.add(a,b);

            Assertions.assertEquals(expectedResult,result);
        }

        @DisplayName("2 + 5 = 7")
        @Test
        public void should_add_2_to_5_and_return_7()
        {
            int a = 2;
            int b = 5;
            int expectedResult = 7;

            int result = calculator.add(a,b);

            Assertions.assertEquals(expectedResult,result);
        }

        //this test is a bad idea, but I wrote it to show how asserAll() works
        @DisplayName("2 + 5 = 7 and 2 + 5 + 1 = 8")
        @Test
        public void should_add_2_to_5()
        {
            int a = 2;
            int b = 5;
            int expectedResult = 7;
            int expectedResult2 = 8;
            Assertions.assertAll(
                    () -> Assertions.assertEquals(expectedResult+1,calculator.add(a,b)),
                    () -> Assertions.assertEquals(expectedResult2+1,calculator.addPlusOne(a,b))
            );
            int result = calculator.add(a,b);

            Assertions.assertEquals(expectedResult,result);
        }
    }

    @DisplayName("Multiply Tests")
    @Nested
    class MultiplyTests
    {
        @DisplayName("5 * 5 = 25")
        @Test
        public void should_multiply_5_with_5_and_return_25()
        {
            int a = 5;
            int b = 5;
            int expectedResult = 25;

            int result = calculator.multiply(a,b);

            Assertions.assertEquals(expectedResult,result);
        }

        @DisplayName("2 * 7 = 14")
        @Test
        public void should_multiply_2_with_7_and_return_14()
        {
            int a = 2;
            int b = 7;
            int expectedResult = 14;

            int result = calculator.multiply(a,b);

            Assertions.assertEquals(expectedResult,result);
        }
    }




}