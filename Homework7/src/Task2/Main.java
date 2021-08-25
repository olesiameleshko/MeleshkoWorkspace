package Task2;

public class Main {
    public static void main(String[] args) {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();
        double celsiusValue = 100;
        double fahrenheitValueConverted = fahrenheitConverter.convert(celsiusValue);
        double kelvinValueConverted = kelvinConverter.convert(celsiusValue);
        System.out.println("The temperature of " + celsiusValue + "°C is " + fahrenheitValueConverted + "°F");
        System.out.println("The temperature of " + celsiusValue + "°C is " + kelvinValueConverted + "°K");
    }
}
