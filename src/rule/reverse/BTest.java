package rule.reverse;

/**
 * 现在来看，使用接口比去写很多重载方法更加方便，也达到快速开发，代码也不臃肿
 */
public class BTest {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.inside(new Apple());
        basket.inside(new Clothes());
    }
}

interface Goods {
    String get();
}
class Apple implements Goods {
    @Override
    public String get() {
        return "苹果";
    }
}
class Clothes implements Goods {
    @Override
    public String get() {
        return "衣服";
    }
}
class Basket {
    // 这里的引用改成接口
    public void inside(Goods goods) {
        System.out.println(goods.get());
    }
}
