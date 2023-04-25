public class StringBuilderClass {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("wiley");
        // sb.append("Edge");

        // "[timestamp user userId : logged in successfully]"

        StringBuilder logMessage = new StringBuilder();
        long timestamp = System.currentTimeMillis();
        logMessage.append("[").append(timestamp).append("] ");
        int userId = 123456;

        logMessage.append("user ").append(userId).append(": ");

        String message = "login successfully";
        logMessage.append(message);
        System.out.println(logMessage);
        
    }
}
