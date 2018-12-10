package com.wangwei.test;

import java.io.File;
import java.io.IOException;

/**
 * @Auther wangwei
 * @Date 2018/12/10 10:49 PM
 */
public class DirTest {
    public static void main(String[] args) throws IOException {
        File file = new File("a.text");
        if (!file.exists())
            file.createNewFile();
    }
}
