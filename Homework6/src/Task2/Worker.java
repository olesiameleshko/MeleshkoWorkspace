package Task2;

public class Worker {
    private IT itSpecialist = new IT();
    private Clerk clerk = new Clerk();

    public String toString () {
        return itSpecialist + "\n" + clerk;
    }
}
