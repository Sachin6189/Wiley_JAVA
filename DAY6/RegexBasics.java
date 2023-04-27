import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
    public static void main(String[] args) {
        // Create a regular expression from a string
        //., \w, \W, \s, \S, \d, \D
        // String re = "..";
        //String re = "\\w\\w\\w."; // (a-zA-Z, 0-9,....)
        //String re = "\\S\\s";
        String re = "\\d\\d\\D";
        String text = "99@";
        Pattern pattern = Pattern.compile(re);

        Matcher matcher = pattern.matcher(text);

        Matcher mt = pattern.matcher(text);
        boolean res = mt.matches();
        System.out.println(res);
    }
}
