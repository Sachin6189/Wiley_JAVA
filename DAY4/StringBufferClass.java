
public class StringBufferClass {
    public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("wiley");   
    StringBuffer sb1 = new StringBuffer("wiley");
    StringBuffer sb2 = new StringBuffer("wiley"); 
    String ss="wiley";

    System.out.println(sb1.equals(sb1));
    System.out.println(sb1.equals(sb1.toString()));
    System.out.println(sb);

    sb.append(" Edge");
    System.out.println(sb);

    sb.insert(4, "JJJJJ");
    System.out.println(sb);

    System.out.println(sb.reverse());
    System.out.println(sb.delete(5, 9));
    }
}