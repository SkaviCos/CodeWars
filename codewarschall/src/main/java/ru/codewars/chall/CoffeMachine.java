package ru.codewars.chall;

import java.util.Scanner;

public class CoffeMachine {
  public static void main(String[] args) {
    System.out.println("Write how many cups of coffee you will need:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("For" + " " + a + " " + "cups of coffee you will need:");
    System.out.println(a * 200 + " " + "ml of water");
    System.out.println(a * 50 + " " + "ml of milk");
    System.out.println(a * 15 + " " + "g of coffee beans");
  }
}
/*
Write how many cups of coffee you will need: 25
For 25 cups of coffee you will need:
5000 ml of water
1250 ml of milk
375 g of coffee beans
 */
