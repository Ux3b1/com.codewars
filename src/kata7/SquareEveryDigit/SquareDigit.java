package kata7.SquareEveryDigit;

import java.util.Arrays;

public class SquareDigit {
    public int squareDigits(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .map(el -> el * el)
                .forEach(stringBuilder::append);
        return Integer.parseInt(stringBuilder.toString());
    }
}

// best practices in stream
/*
import java.util.stream.Collectors;

public class SquareDigit {

    public int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                                      .chars()
                                      .map(i -> Integer.parseInt(String.valueOf((char) i)))
                                      .map(i -> i * i)
                                      .mapToObj(String::valueOf)
                                      .collect(Collectors.joining("")));
    }

}
 */