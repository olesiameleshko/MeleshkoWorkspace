package Task11;

public class Task11 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.anotherChange(10);
        MyClass.change(20);
        System.out.println(myClass.dynamicField);
        System.out.println(MyClass.staticField);
    }
}
