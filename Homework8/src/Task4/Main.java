package Task4;

public class Main {
    public static void main(String... args) {
        int a = 0;
        try {
            int b = 4 / a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("ArithmeticException is executed");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception is executed");
        }
    }
}
