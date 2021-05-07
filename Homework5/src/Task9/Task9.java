package Task9;

public class Task9 {
    public static void main(String[] args) {
        Example example = new Example("Box", 1000);
        Example example1 = new Example("Camera", 2000);
        System.out.println(Example.count); // static variables are accessed directly by giving the class reference
        System.out.println(example.getItem()); ////non-static variables are accessed with the help of class object
        System.out.println(example.getPrice());
        System.out.println(example1.getItem());
        System.out.println(example1.getPrice());
    }
}
// Static variables or fields belong to the class, and not to any object of the class.
// A static variable is initialized when the class is loaded at runtime.
// Non-static fields are instance fields of an object. They can only be accessed or invoked through an object reference.
// The value of static variable remains constant throughout the class.
// The value of Non-static variables changes as the objects has their own copy of these variables.
