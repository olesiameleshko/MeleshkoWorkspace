package Task4;

public class TestClass {
    public static void main(String[] args) {
    A a = new A("Brad", 24, 80);
    B b = new B("Alex", 45, 90);
    System.out.println(a.toString());
    System.out.println(b.toString());
    b.eDescription();
    System.out.println(b);
    System.out.println(b.getInfo());
    System.out.println(a.getInfo());
    }
}
