package Task2;

class Worker {
    String name;

    public Worker(String name) {
        this.name = name;
    }
    public Worker() {
        this.name = "Worker";
        System.out.println("Inside Worker constructor");
    }
}
