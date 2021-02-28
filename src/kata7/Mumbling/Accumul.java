package kata7.Mumbling;

public class Accumul {

    public static String accum(String s) {
        String[] strings = s.toLowerCase().split("");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = multiplyChars(strings[i], i + 1);
        }
        return String.join("-",strings);
    }

    private static String multiplyChars(String s, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(s);
        }
        return upperCaseFirstSymbol(stringBuilder.toString());
    }

    private static String upperCaseFirstSymbol(String s) {
        return String.valueOf(s.charAt(0)).toUpperCase().concat(s.substring(1));
    }
}