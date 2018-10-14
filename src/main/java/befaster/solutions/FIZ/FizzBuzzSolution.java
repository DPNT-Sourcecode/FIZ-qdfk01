package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String result = "";
        if (number % 3 == 0)
            result += "fizz ";

        if (number % 5 == 0)
            result += "buzz ";

        return result.trim();
    }

}
