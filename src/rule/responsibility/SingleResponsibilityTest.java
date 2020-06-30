package rule.responsibility;

public class SingleResponsibilityTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机"); // 这里就不符合实际
    }
}

/**
 * 如同上面所示，在调用第二次run传入“飞机”，打印出：飞机在地上驾驶
 * 这话是错的，原因就是违背了单一责任原则
 * 这种情况下，因为一个类出现多种责任，那么需要把该类分解成多个单一责任的类
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在地上驾驶");
    }
}
