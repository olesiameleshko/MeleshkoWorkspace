package Task5;

public class Main extends Task5 {

    public static void main(String[] args) {
        try {
            iCanThrowException("");
        } catch (Exception e) {
            System.out.println("Recaught in main");
        }
    }
}
