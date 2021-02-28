package kata8.StringRepeat;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            System.out.print(stringBuilder.append(string));
        }
        return stringBuilder.toString();
    }
}
