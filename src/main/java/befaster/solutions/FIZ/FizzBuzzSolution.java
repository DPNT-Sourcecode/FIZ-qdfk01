package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String result = "";

        if (number % 3 == 0)
            result += "fizz ";

        if (number % 5 == 0)
            result += "buzz ";

        result = result.trim();
        result = result == "" ? number.toString() : result;

        return result;
    }

}
