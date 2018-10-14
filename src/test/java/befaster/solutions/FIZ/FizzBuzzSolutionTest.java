package befaster.solutions.FIZ;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void should_Return_fizz_When_Divisible_Only_By_5() {
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(5));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(25));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(5000));
    }
}
