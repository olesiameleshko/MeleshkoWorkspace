package Task6;

public class Task6 {
    public static void main (String[] args) {
        //Task6.Task6.TheWeather theWeather = new Task6.Task6.TheWeather(); //'Task6.Task6.TheWeather()' has private access in 'Task6.Task6.TheWeather'
        TheWeather theWeather1 = TheWeather.createForecast();
        theWeather1.checkWeather();
    }
}
