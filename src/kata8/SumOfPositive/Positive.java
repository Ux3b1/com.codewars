package kata8.SumOfPositive;

import java.util.Arrays;

public class Positive {

    public static int sum(int[] arr) {
        return Arrays.stream(arr)
                .filter(el -> el > 0)
                .sum();
    }
}