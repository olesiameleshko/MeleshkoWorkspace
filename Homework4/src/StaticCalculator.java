//Task4
public class StaticCalculator {
    double firstValue;
    double secondValue;
    String operation;

    public StaticCalculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public double calculate () {
        return switch (operation) {
            case "+" -> firstValue + secondValue;
            case "-" -> firstValue - secondValue;
            case "*" -> firstValue * secondValue;
            case "/" -> secondValue != 0 ? firstValue / secondValue : 0;
            default -> 0.0;
        };

    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue (double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue () {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public String getOperation () {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}

