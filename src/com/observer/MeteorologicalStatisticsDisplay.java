package com.observer;

public class MeteorologicalStatisticsDisplay implements Observer, DisplayElement {

    private float tempSum = 0.0f;
    private float minTemp = 200.0f;
    private float maxTemp = 0.0f;
    private int count; // 记录了多少次温度

    private Subject weatherData;

    public MeteorologicalStatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        count++;

        if(temperature > maxTemp) {
            maxTemp = temperature;
        }

        if(temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / count)
                + "/" + maxTemp + "/" + minTemp);
    }
}
