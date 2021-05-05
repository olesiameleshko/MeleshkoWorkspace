public class Task5 {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        Constructor constructor1 = new Constructor(120, 130, 300);
        Constructor constructor2 = new Constructor("Envelope", "A4", "C4");
        Constructor constructor3 = new Constructor(33, 18008800000L);
        Constructor constructor4 = new Constructor(true, false);
        System.out.println("The empty constructor " + constructor.getArea());
        System.out.println("Height, weight, depth are " + constructor1.getArea());
        System.out.println("Name, format, size are " + constructor2.toString());
        System.out.println("Age: " + constructor3.getAge() + ". Salary: " + constructor3.getSalary());
        System.out.println("Is it started: " + constructor4.isStarted() + ". Stopped: " + constructor4.isStopped());
    }
}
