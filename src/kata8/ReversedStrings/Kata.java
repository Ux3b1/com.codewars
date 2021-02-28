package kata8.ReversedStrings;

public class Kata {
    public static String solution(String str) {
        // Your code here...
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}