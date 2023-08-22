package org.example.Les1;

import java.io.File;

public class Application1 {
    public static void main(String[] args) {

        System.out.println(getFileSize(new File("123")));

        System.out.println(divide(10, 0));

        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[11]);
    }



    public static int divide(int a1, int a2) {
        if (a2 == 0){
            return -1;
        }
        return a1 / a2;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1;
        }
        return file.length();
    }

}