package com.observer.another;


import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;


    // 模拟设置
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 封装通知
    public void measurementsChanged() {
        // 每次变化需要调用setChanged
        setChanged();
        // notifyObservers方法中会自动调用clearChanged，把changed标记重置
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
