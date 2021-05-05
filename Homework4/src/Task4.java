public class Task4 {
    public static void main(String[] args) {
        StaticCalculator staticCalculator = new StaticCalculator(10, 5, "+");
        System.out.println(staticCalculator.calculate());
        staticCalculator.setOperation("-");
        System.out.println(staticCalculator.calculate());
        staticCalculator.setFirstValue(20);
        staticCalculator.setOperation("*");
        System.out.println(staticCalculator.calculate());
        staticCalculator.setFirstValue(0);
        staticCalculator.setSecondValue(0);
        System.out.println(staticCalculator.calculate());
        staticCalculator.setFirstValue(30);
        staticCalculator.setSecondValue(10);
        staticCalculator.setOperation("/");
        System.out.println(staticCalculator.calculate());
        System.out.println("First value is " + staticCalculator.getFirstValue() + ". Second value is " + staticCalculator.getSecondValue() + ". The operation is " + staticCalculator.getOperation() + ".");
    }
}
