package com.decorator.my.test;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase((char)c);
    }

    /**
     *
     * @param b 读取数据的缓冲区
     * @param off 目标数组b中的起始偏移量
     * @param len 读取的最大字节数
     * @return 读取到缓冲区中的字节总数
     * @throws IOException
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for(int i = off; i < off + result; i++) { // 注意不是len
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }

    @Override
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }
}
