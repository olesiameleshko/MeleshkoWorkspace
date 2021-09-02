package Task2;

public class Task2 {
    public static int divideByZero() {
        int a = 5;
        int b = 0;
        try {
            return a / b;
        } catch (ArithmeticException e) {
        System.out.println("Division by zero");
        System.out.println(e.getMessage());
        e.printStackTrace();
        }
        return 0;
    }
}
