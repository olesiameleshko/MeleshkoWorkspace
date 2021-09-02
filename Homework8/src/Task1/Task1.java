package Task1;

public class Task1 {

    void method(int number) throws Exception {
        try {
            if (number < 0) {
                System.out.println("Number < 0");
            } else if (number > 0) {
                System.out.println("Number > 0");
            } else if (number == 0)
                System.out.println("Number = 0");
            throw new Exception("Message");
        } catch (ArithmeticException ex) {
            System.out.println("Exception is called");
            throw new Exception("Message");
        }
    }
}
