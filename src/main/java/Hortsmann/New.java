package Hortsmann;

import java.util.Random;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
       //Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 3;

        //int c = a + b++;//5
        //System.out.println(c);
        int d = a + --b;//6
        System.out.println(d);
        Runnable r = () -> System.out.println("123");
        //r.run();

        /*int[] a  = {1,2,3,4,5,6,8,9,0};
        String str = ("(XXX)-XXXXXX");
        for(int i:a) {
            str = str.replaceFirst("X", Integer.toString(i));
            //System.out.println(str);
        }
        System.out.println(str);
            */
        }

}
