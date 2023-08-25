package org.example.Les2;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
/*
.NullPointerException
 */
//        String name = null;
//        System.out.println(name.length());
/*
ClassCastException
*/
//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);
/*
.NumberFormatException
 */
//        String number = "123qwe";
//        int result = Integer.parseInt(number);
//        System.out.println(result);
/*
UnsupportedOperationException
 */
//            List<Object> emptyList = Collections.emptyList();
//            emptyList.add(new Object());
        int number = 1;
        try {
            number = 10 / 0;
            String test = null;
            System.out.println(test.length());
        } catch (ArithmeticException e) {
            System.out.println("На ноль не делим");
        } catch (NullPointerException e) {
            System.out.println("nullpointer");
        }
    }
}
