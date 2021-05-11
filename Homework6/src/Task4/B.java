package Task4;

public class B extends A {
    public B(String name, int age, int weight) {
        super(name, age, weight);
    }
    @Override
    public String toString () {
        return "This is class B";
    }
    public String getInfo() {
        return "The name: " + name + " and age: " + age + " and weight: " + weight;
    }
    void eDescription() {
        super.description();
        System.out.println("The description from class B");
    }
}
