package Task1;

public class Main {
    public static void main(String[] args){
        Task1 task1 = new Task1();
            task1.method(9);
        try {
            task1.method(0);
        } catch (ArithmeticException e) {
            System.out.println("Recaught in main");
        }
            task1.method(-7);
    }
}