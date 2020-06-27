package com.decorator.my.test;

import com.decorator.my.HotPot;
import com.decorator.my.TwoFlavorHotPot;
import com.decorator.my.component.Beef;
import com.decorator.my.component.RomaineLettuce;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        // // 选择鸳鸯锅
        // HotPot twoFlavorHotPot = new TwoFlavorHotPot();
        // // 加食材
        // twoFlavorHotPot = new Beef(twoFlavorHotPot); // 加牛肉
        // twoFlavorHotPot = new RomaineLettuce(twoFlavorHotPot); // 加生菜
        // // 打印账单
        // System.out.println("您点了" + twoFlavorHotPot.getDescription()
        //     + ", 总共" + twoFlavorHotPot.cost() + "元");

        File file = new File("F:\\1.txt");
        if(file.exists()) {
            // 创建一个输入流，并传入File类型
            InputStream inputStream = new FileInputStream(file);
            // 不使用缓冲区，就每读取一个字节就写入一次到磁盘中。FileInputStream就是一次一次读的，即使使用read(byte[] read)方法，它也是一次一次读到数组中
            OutputStream outputStream1 = new FileOutputStream("F:\\2.txt");
            long startTime = System.currentTimeMillis();
            byte[] read = new byte[8*1024];
            int temp = 0;
            while((temp = inputStream.read(read)) != -1) {
                outputStream1.write(read);
            }
            outputStream1.close();
            long endTime = System.currentTimeMillis();
            System.out.println("不使用缓冲区的时间：" + (endTime - startTime));

            // 使用缓冲区，一次读取多个字节，然后暂时存放到内存，等到字节大小等于缓冲区大小时就把它们写入到磁盘中。BufferedInputStream就是使用缓冲区的读
            // 也可以这样写：BufferedInputStream bf = new BufferedInputStream(inputStream);
            inputStream = new BufferedInputStream(inputStream);
            OutputStream outputStream2 = new FileOutputStream("F:\\3.txt");
            startTime = System.currentTimeMillis();
            read = new byte[8*1024];
            temp = 0;
            while((temp = inputStream.read(read)) != -1) {
                outputStream2.write(read);
            }
            outputStream2.close();
            inputStream.close();
            endTime = System.currentTimeMillis();
            System.out.println("使用缓冲区的时间：" + (endTime - startTime));
        }

        // int temp = 0;
        // InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("F:\\3.txt")));
        // while((temp = in.read()) != -1) {
        //     System.out.print((char)temp);
        // }
        // in.close();
    }
}
