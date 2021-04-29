import java.util.UUID;
public class Task9 {
    public static void main(String[] args) {
        String s = "Test String";
        //String s = "Test String.";
        //String s = UUID.randomUUID().toString();
        if (s.endsWith(".")) {
            System.out.println(s);
        }
        else {
            System.out.print(s.concat("."));
        }
    }
}