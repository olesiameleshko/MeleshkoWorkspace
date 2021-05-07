package Task8;//Task 8

public class PrivateFields {
    private int value;
    private char code;
    private double weight;
    private String type;
    private boolean finished;

    public PrivateFields() {
    }

    public int getValue() {

        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }

    public char getCode () {
        return code;
    }

    public void setCode(char code) {

        this.code = code;
    }

    public double getWeight () {

        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public String getType () {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public boolean isFinished() {
        return finished;

    }

    public void setFinished(boolean finished) {

        this.finished = finished;
    }
}
