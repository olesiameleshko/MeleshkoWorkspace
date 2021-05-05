public class Task2 {
    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(81, 120, 200);
        Boxer anotherBoxer = new Boxer(50, 100, 190);
        System.out.println(ourBoxer.fight(anotherBoxer));
    }
}
