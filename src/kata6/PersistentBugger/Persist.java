package kata6.PersistentBugger;

import java.util.Arrays;

class Persist {
    public static int persistence(long n) {
        int x = 0;
        int[] nums = getArrayFromInt(n);
        while (nums.length != 1) {
            x++;
            nums = getArrayFromInt(devidedNums(nums));
        }
        return x;
    }

    private static int devidedNums(int[] nums) {
        return Arrays.stream(nums)
                .reduce((el1, el2) -> el1 * el2)
                .getAsInt();
    }

    private static int[] getArrayFromInt(long n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

