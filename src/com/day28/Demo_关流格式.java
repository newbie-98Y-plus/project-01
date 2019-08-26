package com.day28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_关流格式 {
    public static void main(String[] args) throws IOException {
        try (
                FileInputStream fis = new FileInputStream("qqq.txt");
                FileOutputStream fos = new FileOutputStream("q_copy.txt");
          ) {
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
        }
    }
}
