package rule.responsibility;

public class PerfectSingleResponsibilityTest {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        SkyVehicle skyVehicle = new SkyVehicle();
        skyVehicle.fly("飞机");
    }
}

/**
 * 按照要求，分解单类多责任成多个单一责任的类
 * 额外：对于逻辑简单的，其实可以从一个类中把多个责任分解成多个方法，虽然跟单一责任原则规定的是类不一样。但这里的方法遵守单一责任原则。
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在地上驾驶");
    }
}

class SkyVehicle {
    public void fly(String vehicle) {
        System.out.println(vehicle + "在天上驾驶");
    }
}

