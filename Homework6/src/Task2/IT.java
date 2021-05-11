package Task2;

public class IT {
    private Programmer programmer = new Programmer();
    private ProjectManager projectManager = new ProjectManager();
    private CTO cto = new CTO();

    public String toString () {
        return programmer + "\n" + projectManager + "\n" + cto;
    }
}
