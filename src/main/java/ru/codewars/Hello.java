package ru.codewars;

public class Hello {
    public String sayHello(String [] name, String city, String state){
        //code here
        Hello h = new Hello();
        String t = "";
        for(String s:name)
            t += s + " ";
        return "Hello," + " " + t.substring(0,t.length()-1) + "!" + " " + "Welcome to" + " " + city + ","
                + " " + state + "!";
    }
    /*public static void main(String[] args){
        Hello h = new Hello();


        System.out.println(h.sayHello(new String[]{"kolae"},"lok","pok"));
    }*/


}
