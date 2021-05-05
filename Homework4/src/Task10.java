public class Task10 {
    public static void main (String[] args) {
        Overloading over = new Overloading();
        over.overload();
        over.overload(1);
        over.overload(30.0);
        over.overload(1, 2);
        over.overload(2.0, 1);
        over.overload(1.0, 3.0);
        over.overload(2, 1.0);
        over.overload(true, false);
        over.overload(1, true);
        over.overload(false, 20.0);
        System.out.println("sum of test(long, int) was called: " + over.overload(2000000L, 1));
        System.out.println("sum of test(long, int, int) was called: " + over.overload(2000000L, 2, 3));
        System.out.println("sum of test(long, int, int, int) was called: " + over.overload(2000000L, 2, 3, 4));
    }
}
