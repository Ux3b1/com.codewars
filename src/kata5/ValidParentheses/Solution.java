package kata5.ValidParentheses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static boolean validParentheses(String parens) {
        if (parens.length() > 100) {
            return false;
        }

        String res = parens;
        Pattern pattern = Pattern.compile("(\\([^()]+?\\))|(\\(\\))");
        Matcher matcher = pattern.matcher(parens);

        while (matcher.find()) {
            res = res.replace(matcher.group(), "");
            matcher.reset(res);
        }

        return !Pattern.compile("[\\(\\)]").matcher(res).find();
    }
}

/* fast solution
public class Solution{

  public static boolean validParentheses(String str) {

    int count = 0;

    for(int i = 0; i < str.length(); i++) {

      if(str.charAt(i) == '(') count++;
        else if(str.charAt(i) == ')') count--;
      if(count < 0) return false;
    }
    if(count == 0) return true;
    else return false;
  }
}
*/