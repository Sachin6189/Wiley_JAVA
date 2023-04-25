import java.util.Arrays;
import java.util.List;

public class StringFormat {
    
public static void main(String[] args) {
    // String title = "java Developer";
    // float salary = 2000.39f;
    // System.out.format("%s has %.2f USD salary", title, salary);

    List<String> tecStack = Arrays.asList("Essential JAVA","Head First JAVA","Java Design Patterns");
    for(String book:tecStack){
        System.out.format("%-30s - In stock%n", book);
    }
}
}
