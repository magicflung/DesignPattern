package com.facade;

public class HomeTheaterFacade {
    PopcornPopper popcornPopper;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    Tuner tuner;
    DVDPlayer dvdPlayer;

    public HomeTheaterFacade(PopcornPopper popcornPopper, Projector projector, TheaterLights theaterLights, Screen screen, Tuner tuner, DVDPlayer dvdPlayer) {
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movieName) {
        // 1.打开爆米花机，然后炸爆米花；
        popcornPopper.start();
        popcornPopper.make();
        popcornPopper.end();
        // 2.打开投影仪，将输入切换到DVD输入；
        projector.on();
        projector.changeDVD();
        // 3.调暗灯光，打开屏幕；
        theaterLights.setBrightness(2); // 1~10, 越亮数值越高
        screen.on();
        // 4.打开音响，可能需要调音量；
        tuner.on();
        tuner.turnUp();
        tuner.turnUp();
        // 5.打开DVD播放器，开始播放；
        dvdPlayer.on();
        dvdPlayer.searchMovieName(movieName);
    }

    public void endMovie() {
        dvdPlayer.off();
        tuner.off();
        screen.off();
        projector.off();
        theaterLights.off();
    }
}
