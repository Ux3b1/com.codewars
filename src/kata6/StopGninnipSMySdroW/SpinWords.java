package kata6.StopGninnipSMySdroW;

public class SpinWords {

    public String spinWords(String sentence) {
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > 4) {
                strings[i] = new StringBuilder(strings[i]).reverse().toString();
            }
        }
        return String.join(" ", strings);
    }
}