public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer chartHistory = new StringBuffer();

        String sender = "Venkat";
        String message = "Hey Sachin!";

        chartHistory.append(sender);
        chartHistory.append(": ");
        chartHistory.append(message);
        chartHistory.append("\n");

        sender = "Sachin";
        message = "Hello Venkat!";

        chartHistory.append(sender);
        chartHistory.append(": ");
        chartHistory.append(message);
        chartHistory.append("\n");

        System.out.println(chartHistory);

    }
}
