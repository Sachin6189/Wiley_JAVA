public class StringProcess {
    public static void main(String[] args) {
        String s1 = "wiley";
        String s2 = "wiley";

        String s3 = new String("wiley");
        String s4 = new String("wiley");
//         System.out.println(s1==s2);
//         System.out.println(s2==s3);
//         System.out.println(s3 == s4);
        String str = "I am a JAVA Developer";
        String str1 = "Python";

        String str2 = str.concat(str1);

        String fname = "B";
        String mname = "V";
        String lname = "S";

        String fullname = fname.concat(mname).concat(" ").concat(lname);
        System.out.println(fullname);

        System.out.println(str.length());
        System.out.println(str.charAt(10));
        System.out.println(str2);

        System.out.println(str.replace("D","d"));

        String st[] = str.split("");
        System.out.println(st);
        for(String string:st){
            System.out.println(string);
        }
        String userInput = " mobile";
        System.out.println(userInput);
        System.out.println(userInput.trim());

        System.out.println(str.substring(0, 4));

        System.out.println(str.toUpperCase());
}
}
