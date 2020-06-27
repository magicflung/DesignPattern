package com.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        MeteorologicalStatisticsDisplay meteorologicalStatisticsDisplay = new MeteorologicalStatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(38, 35, 30.4f);
        weatherData.setMeasurements(29, 56, 29.5f);
    }
}
