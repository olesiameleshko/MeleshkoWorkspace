package com.Task6;

public class Task6 {
    public static void main (String[] args) {
        //com.Task6.com.Task6.TheWeather theWeather = new com.Task6.com.Task6.TheWeather(); //'com.Task6.com.Task6.TheWeather()' has private access in 'com.Task6.com.Task6.TheWeather'
        TheWeather theWeather1 = TheWeather.createForecast();
        theWeather1.checkWeather();
    }
}
