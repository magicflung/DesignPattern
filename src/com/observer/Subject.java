package com.observer;

public interface Subject {
    void registerObserver(Observer observer); // 注册
    void removerObserver(Observer observer); // 移除
    void notifyObservers(); // 通知全体观察者
}
