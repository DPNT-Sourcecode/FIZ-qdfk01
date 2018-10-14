package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String result = "";

        if (number % 3 == 0 || containsNumber(number, 3))
            result += "fizz ";

        if (number % 5 == 0 || containsNumber(number, 5))
            result += "buzz ";

        if (number > 10 && isIdentical(number))
            if (number % 2 == 0)
                result += "deluxe ";
            else
                result += "fake deluxe ";

        result = result.trim();
        result = result == "" ? number.toString() : result;

        return result;
    }

    private boolean containsNumber(int number, int containsNumber) {
        String numberString = String.valueOf(number);
        return numberString.contains(String.valueOf(containsNumber));
    }

    private boolean isIdentical(int number) {
        String numberString = String.valueOf(number);
        char[] numberArray = numberString.toCharArray();
        char first;
        int i, n = numberArray.length;

        if (n == 0)
            return true;

        first = numberArray[0];
        for (i = 1; i < n; i++)
            if (numberArray[i] != first)
                return false;

        return true;
    }
}
