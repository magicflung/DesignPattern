package com.factory.three;

public abstract class FrenchFries {
    String name;

    void machining() {
        System.out.println("制作" + this.name + "中");
    }

    void boxing() {
        System.out.println("包装" + this.name + "中");
    }

    void end() {
        System.out.println("完毕");
    }
}
