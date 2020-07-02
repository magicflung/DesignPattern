package rule.reverse;
import	java.awt.BasicStroke;

/**
 * 代码这样写没问题！
 * 但是，想想篮子只允许放苹果吗，还可以放别的吧？而且不止水果，手机，衣服都可以放对不对？
 * 此时解决的思路是什么？可能会想到重载方法，当然没问题，如果此时有很多东西可以放在里面，那么就得去写很多重载方法，有1000个物品就得写1000个方法（别拿可以copy的思想来解决）
 *      未来如果有新增还得去写类和添方法。
 * 通过依赖倒转原则，可以想到使用抽象类或者接口来当引用，如果未来物品多了，也不怕，只要实现类就可以了。
 */
public class ATest {
    public static void main(String[] args) {
        // Basket basket = new Basket();
        // basket.inside(new Apple());
    }
}
// 为了不影响BTest，先注释掉
// class Apple {
//     public String get() {
//         return "苹果";
//     }
// }
// class Basket {
//     public void inside(Apple apple) {
//         System.out.println(apple.get());
//     }
// }
