package equilibrium.UnitTesingJava;

import org.junit.jupiter.api.*;

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