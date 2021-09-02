package com.Task6;

//Task 6
public class TheWeather {
    String season;

    private TheWeather() {
    }

    public static TheWeather createForecast() {
        return new TheWeather();
    }
    public void checkWeather() {
        System.out.println("The weather is cold");

    }
}

