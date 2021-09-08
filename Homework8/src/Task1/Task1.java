package Task1;

public class Task1 {

    void method(int number) throws ArithmeticException {
            if (number < 0) {
                System.out.println("Number < 0");
            } else if (number > 0) {
                System.out.println("Number > 0");
            } else {
                System.out.println("Number = 0");
                throw new ArithmeticException("Message");
            }
    }
}
