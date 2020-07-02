package rule.ocp;

/**
 * 比较一下之前的代码，真的更加间洁
 */
public class TestB {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Draw draw = new Draw();
        draw.draw(triangle);
    }
}

class Draw {
    // 现在使用接口来做参数，因为java的多态性，以后有新增的图形类都不用去修改以下代码而直接使用
    // 而且也不用去使用if..else判断
    public void draw(Shape shape) {
        shape.get();
    }
}

interface Shape {
    void get();
}
class Circular implements Shape {
    public void get() {
        System.out.println("画圆");
    }
}

class Rectangle implements Shape {
    public void get() {
        System.out.println("画矩形");
    }
}
// 此时新增新图形
class Triangle implements Shape{
    public void get() {
        System.out.println("画三角形");
    }
}