//Task 10
public class Overloading {
    void overload() {

        System.out.println("test() was called");
    }

    void overload(int a) {

        System.out.println("test(int) was called");
    }

    void overload(double a) {

        System.out.println("test(double) was called");
    }

    void overload(int a, int b) {
        System.out.println("test(int, int) was called");
    }

    void overload(double a, int b) {

        System.out.println("test(double, int) was called");
    }

    void overload(double a, double b) {

        System.out.println("test(double, double) was called");
    }

    void overload(boolean a, boolean b) {

        System.out.println("test(boolean, boolean) was called");
    }

    void overload(int a, boolean b) {

        System.out.println("test(int, boolean) was called");
    }

    void overload(boolean a, double b) {

        System.out.println("test(int, boolean) was called");
    }

    public double overload(long a, int b) {

        return a + b;
    }

    public double overload(long a, int b, int c) {

        return a + b + c;
    }

    public double overload(long a, int b, int c, int d) {
        return a + b + c + d;
    }
}