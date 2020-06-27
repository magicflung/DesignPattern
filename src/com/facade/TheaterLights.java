package com.facade;

public class TheaterLights {
    int brightness; // 1~10

    public void on() {
        System.out.println("打开灯...");
    }

    public void off() {
        System.out.println("关闭灯...");
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("灯管亮度调为" + brightness);
    }

    public int getBrightness() {
        return brightness;
    }
}
