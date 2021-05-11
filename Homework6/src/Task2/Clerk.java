package Task2;

public class Clerk {
    private HR recruiter = new HR();
    private Cleaner cleaner = new Cleaner();
    private OfficeManager officeManager = new OfficeManager();

    public String toString () {
        return recruiter + "\n" + cleaner + "\n" + officeManager;
    }
}

