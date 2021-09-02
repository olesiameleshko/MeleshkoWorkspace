package Task5;

public class Task5 {
    public static void iCanThrowException(String argument) {
        try {
            if (argument.isEmpty())
                throw new Exception("Message");
        } catch (Exception e) {
            System.out.println("Invalid argument exception.");
            throw new NullPointerException();
        }
    }
}
