import java.util.StringTokenizer;

public class StringtokenClass {
    public static void main(String[] args) {
        String input = "We,love,java,programming";
        StringTokenizer st = new StringTokenizer(input, ",");

        System.out.println(st.countTokens());

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
       // System.out.println(st.nextToken());
    }
}
