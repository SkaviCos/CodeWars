package ru.codewars;

import java.util.LinkedList;
import java.util.List;

public class Listst {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(2);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(20);
        l.add(5);
        l.add(243);
        System.out.println(l.get(0));
        System.out.println(l.size());
        for(int i =0;i<l.size();i++){
            if(l.get(i)%2==0){
                l.remove(i);
                i--;
            }
        }
        System.out.println(l);
    }
}
