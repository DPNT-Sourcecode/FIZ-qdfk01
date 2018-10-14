package befaster.solutions.FIZ;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() {
        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @After
    public void tearDown() {
        fizzBuzzSolution = null;
    }

    @Test
    public void should_Return_fizz_When_Divisible_Only_By_3() {
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(3));
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(9));
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(18));
    }

    @Test
    public void should_Return_fizz_When_Contains_3() {
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(13));
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(23));
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(43));
    }

    @Test
    public void should_Return_buzz_When_Divisible_Only_By_5() {
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(5));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(25));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(5000));
    }

    @Test
    public void should_Return_buzz_When_Contains_5() {
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(52));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(251));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(5008));
    }

    @Test
    public void should_Return_fizz_buzz_When_Divisible_By_3_And_5() {
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(15));
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(75));
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(6000));
    }

    @Test
    public void should_Return_fizz_buzz_When_Divisible_By_3_Or_Contains_3_And_Divisible_By_5_Or_Contains_5() {
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(51));
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(35));
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(53));
    }

    @Test
    public void should_Return_number_When_Not_Divisible_By_3_Or_5() {
        assertEquals("1", fizzBuzzSolution.fizzBuzz(1));
        assertEquals("7", fizzBuzzSolution.fizzBuzz(7));
        assertEquals("6001", fizzBuzzSolution.fizzBuzz(6001));
    }

    @Test
    public void should_Return_deluxe_When_Greater_Than_10_And_Numbers_Identical_And_Not_Satisfying_fizz_And_buzz_Conditions() {
        assertEquals("deluxe", fizzBuzzSolution.fizzBuzz(11));
        assertEquals("deluxe", fizzBuzzSolution.fizzBuzz(22));
        assertEquals("deluxe", fizzBuzzSolution.fizzBuzz(4444));
    }

    @Test
    public void should_Return_fizz_deluxe_When_Greater_Than_10_And_Numbers_Identical_And_Not_Satisfying_fizz_And_buzz_Conditions() {
        assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(33));
        assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(666));
        assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(9999));
    }
}
