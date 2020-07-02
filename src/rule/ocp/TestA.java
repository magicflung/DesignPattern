package rule.ocp;

public class TestA {
    public static void main(String[] args) {
        // 省略
    }
}

// class Draw {
//     // 这里简单点，用i来表示要画什么图形，1为圆，2为矩形
//     public void draw(int i) {
//         // 原先代码
//         // if(i == 1) {
//         //     new Circular().get();
//         // } else if(i == 2) {
//         //     new Rectangle().get();
//         // }
//         // 得修改使用方的原有代码，这就违背开闭原则：
//         if(i == 1) {
//             new Circular().get();
//         } else if(i == 2) {
//             new Rectangle().get();
//         } else if(i == 3) {
//             new Triangle().get();
//         }
//     }
// }
//
// class Circular {
//     public void get() {
//         System.out.println("画圆");
//     }
// }
//
// class Rectangle {
//     public void get() {
//         System.out.println("画矩形");
//     }
// }
// // 此时新增新图形
// class Triangle {
//     public void get() {
//         System.out.println("画三角形");
//     }
// }