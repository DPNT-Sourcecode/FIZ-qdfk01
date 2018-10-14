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
    public void should_Return_fizz_When_Contains_3() {
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(13));
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(23));
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(43));
    }

    @Test
    public void should_Return_buzz_When_Divisible_Only_By_5() {
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(10));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(20));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(1000));
    }

    @Test
    public void should_Return_buzz_When_Contains_5() {
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(52));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(251));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(5008));
    }

    @Test
    public void should_Return_fizz_buzz_When_Divisible_By_3_And_5() {
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(60));
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(90));
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
    public void should_Return_fizz_deluxe_When_Even_Divisible_By_3_And_Contains_3_And_Not_Satisfying_buzz_deluxe() {
        assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(36));
        assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(636));
        assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(3666));
    }

    @Test
    public void should_Return_buzz_deluxe_When_Even_Divisible_By_5_And_Contains_5_And_Not_Satisfying_fizz_deluxe() {
        assertEquals("buzz deluxe", fizzBuzzSolution.fizzBuzz(50));
        assertEquals("buzz deluxe", fizzBuzzSolution.fizzBuzz(250));
        assertEquals("buzz deluxe", fizzBuzzSolution.fizzBuzz(5000));
    }

    @Test
    public void should_Return_fizz_buzz_deluxe_When_Even_Divisible_By_3_And_5_And_Contains_3_And_5() {
        assertEquals("fizz buzz deluxe", fizzBuzzSolution.fizzBuzz(3510));
        assertEquals("fizz buzz deluxe", fizzBuzzSolution.fizzBuzz(5340));
        assertEquals("fizz buzz deluxe", fizzBuzzSolution.fizzBuzz(1530));
    }

    @Test
    public void should_Return_fizz_fake_deluxe_When_Odd_Divisible_By_3_And_Contains_3_And_Not_Satisfying_buzz_deluxe() {
        assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(33));
        assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(633));
        assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(3663));
    }

    @Test
    public void should_Return_buzz_fake_deluxe_When_Odd_Divisible_By_5_And_Contains_5_And_Not_Satisfying_fizz_deluxe() {
        assertEquals("buzz fake deluxe", fizzBuzzSolution.fizzBuzz(55));
        assertEquals("buzz fake deluxe", fizzBuzzSolution.fizzBuzz(155));
        assertEquals("buzz fake deluxe", fizzBuzzSolution.fizzBuzz(5005));
    }

    @Test
    public void should_Return_fizz_buzz_fake_deluxe_When_Odd_Divisible_By_3_And_5_And_Contains_3_And_5() {
        assertEquals("fizz buzz fake deluxe", fizzBuzzSolution.fizzBuzz(3525));
        assertEquals("fizz buzz fake deluxe", fizzBuzzSolution.fizzBuzz(5355));
        assertEquals("fizz buzz fake deluxe", fizzBuzzSolution.fizzBuzz(2535));
    }


}
