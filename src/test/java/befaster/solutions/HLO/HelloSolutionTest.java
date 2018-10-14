package befaster.solutions.HLO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloSolutionTest {
    private HelloSolution helloSolution;

    @Before
    public void setUp() {
        helloSolution = new HelloSolution();
    }

    @After
    public void tearDown() {
        helloSolution = null;
    }

    @Test
    public void should_Return_Hello_World() {
        String expected = "Hello, World!";
        String parameter = "";
        String actual = helloSolution.hello(parameter);
        assertEquals(expected, actual);
    }
}
