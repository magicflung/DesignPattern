package rule.isolation;

public class BTest {
    public static void main(String[] args) {
        InterfaceA a = new ClassB();
        ClassC c = new ClassC();
        c.test1(a);
        c.test2(a);
        c.test3(a);
    }
}

/**
 * 应该这样写
 */
interface InterfaceA {
    void operation1();
    void operation2();
    void operation3();
}
interface InterfaceD {
    void operation4();
    void operation5();
}
class ClassB implements InterfaceA, InterfaceD {


    @Override
    public void operation1() {
        System.out.println("B实现了A的operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了A的operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了A的operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B实现了D的operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B实现了D的operation5");
    }
}

class ClassC {
    public void test1(InterfaceA a) {
        a.operation1();
    }

    public void test2(InterfaceA a) {
        a.operation2();
    }

    public void test3(InterfaceA a) {
        a.operation3();
    }
}