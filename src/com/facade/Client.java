package com.facade;

public class Client {
    public static void main(String[] args) {
        // 注册组件
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        Tuner tuner = new Tuner();
        DVDPlayer dvdPlayer = new DVDPlayer();

        // 一键打开
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(popcornPopper, projector, theaterLights, screen, tuner, dvdPlayer);
        homeTheaterFacade.watchMovie("战狼");

        // 一键关闭
        homeTheaterFacade.endMovie();
    }
}
