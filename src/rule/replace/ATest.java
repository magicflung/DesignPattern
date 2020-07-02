package rule.replace;

/**
 * 里氏替换原则
 */
public class ATest {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
    }
}

class Base {
    // 省略其他方法和属性
}
class A extends Base{
    public int func1(int a, int b) {
        return a - b;
    }
}
// 原先是这样写的
// class B extends A {
//     // 不小心重写了类B，继承中的重写可以没有@Override
//     public int func1(int a, int b) {
//         return a + b;
//     }
//
//     public int func2(int a, int b) {
//         return a * b;
//     }
// }
// 使用了里氏替换原则
class B extends Base {
    // 使用组合
    A a = new A();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return a * b;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}