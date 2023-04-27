import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatch {
    public static void main(String[] args) {
        String cardnumber = "4243-2432-2455-2555";

        Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
        Matcher matcher = pattern.matcher(cardnumber);

       String maskedCard = matcher.replaceAll("xxxx-xxxx-xxxx-");
       System.out.println(maskedCard);
    }
}
