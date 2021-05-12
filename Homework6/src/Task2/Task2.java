package Task2;

public class Task2 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        IT it = new IT();
        Programmer programmer = new Programmer();
        Clerk clerk = new Clerk();
        Cleaner cleaner = new Cleaner();
        System.out.println(worker.name);
        System.out.println(it.name);
        System.out.println(programmer.name);
        System.out.println(clerk.name);
        System.out.println(cleaner.name);
    }
}
