package kata7.HighestAndLowest;

import java.util.Arrays;
import java.util.Objects;

public class Kata {
    public static String highAndLow(String numbers) {
        // Code here or
        Objects.requireNonNull(numbers);

        int[] num = Arrays.stream(numbers.split("\\s"))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        return String.format("%d %d",
                num[num.length - 1],
                num[0]);
    }
}