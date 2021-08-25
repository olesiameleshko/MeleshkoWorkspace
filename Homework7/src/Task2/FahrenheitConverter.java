package Task2;

public class FahrenheitConverter implements Converter{
    @Override
    public double convert(double celsius) {
       return ((9.0/5.0) * celsius + 32);
    }
}
