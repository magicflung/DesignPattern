package com.facade;

public class DVDPlayer {

    public void on() {
        System.out.println("打开DVD播放器...");
    }

    public void off() {
        System.out.println("关闭DVD播放器...");
    }

    public void searchMovieName(String movieName) {
        System.out.println("正在搜索" + movieName);
        System.out.println("找到，正在播放...");
    }
}
