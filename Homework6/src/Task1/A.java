package Task1;

public class A {
    private B jobTitle;
    private C cc = new C();

    public A(){
        this.jobTitle=new B();
        jobTitle.setSalary(1000);
        jobTitle.setJobTitle("PM");
    }
    public double getSalary() {

        return jobTitle.getSalary();
    }

    @Override
    public String toString() {
        return "The job title is: " + jobTitle.getJobTitle() + "\n" +
                "The salary is: " + getSalary() + "\n" +
                "The company and country are: " + cc;
    }
}

