package ru.codewars;

import com.sun.org.apache.xpath.internal.SourceTree;

public class StringToInt {
    public static void main(String[] args){
        int num = 654;
        String s = "" + num;

        System.out.println(s);
        System.out.println(s instanceof String);
    }
}
