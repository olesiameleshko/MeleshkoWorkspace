package Task1;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        try {
            task1.method(9);
        } catch (Exception e) {
            System.out.println("Recaught in main");
        }
        try {
            task1.method(-7);
        } catch (Exception e) {
            System.out.println("Recaught in main");
        }
    }
}