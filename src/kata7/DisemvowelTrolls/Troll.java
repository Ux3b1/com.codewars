package kata7.DisemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        return str.replaceAll("[eEuUiIoOaA]", "");
    }
}