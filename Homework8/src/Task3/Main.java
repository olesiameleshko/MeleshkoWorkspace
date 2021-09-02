package Task3;

public class Main {
    public static void main(String[] args) {
        try {
        int a = args.length;
        System.out.println(a);
            int b = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
            System.out.println(e.getCause());
            try {
                int[] c = {1};
                System.out.println(c[1]);
            } catch (ArrayIndexOutOfBoundsException s) {
                System.out.println(s.getMessage());
                System.out.println(s.getCause());
            }
        }
    }
}
