package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String result = "";

        if (number % 3 == 0 || containsNumber(number, 3))
            result += "fizz ";

        if (number % 5 == 0 || containsNumber(number, 5))
            result += "buzz ";

        result = result.trim();
        result = result == "" ? number.toString() : result;

        return result;
    }

    private boolean containsNumber(int number, int containsNumber) {
        String numberString = String.valueOf(number);
        return numberString.contains(String.valueOf(containsNumber));
    }
}
