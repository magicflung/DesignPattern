package com.observer.another;

import com.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class MeteorologicalStatisticsDisplay implements Observer, DisplayElement {

    private float tempSum = 0.0f;
    private float minTemp = 200.0f;
    private float maxTemp = 0.0f;
    private int count; // 记录了多少次温度

    private Observable observable;

    public MeteorologicalStatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            float temperature = weatherData.getTemperature();
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
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / count)
                + "/" + maxTemp + "/" + minTemp);
    }

}
