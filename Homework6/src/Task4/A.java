package Task4;

public class A {
    String name;
    int age;
    int weight;


    public A(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String toString() {

        return "This is class A";
    }

    void description() {

        System.out.println("The description from class A");
    }

    public String getInfo() {

        return "The name: " + name + " and age: " + age + " and weight: " + weight;
    }
}

