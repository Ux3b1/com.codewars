package kata8.ReturnNegative;

public class Kata {

    public static int makeNegative(final int x) {
        int a = x;
        return a > 0 ? -1 * a : a;
    }
}