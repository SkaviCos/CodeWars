package ru.codewars.chall;

import java.util.Random;

public class TicTacToe {
  public static void main(String[] args) {
    String tic[] = {"0","X"," ","X","0","0","X","0"," "};
    System.out.println(tic[0]+" " +tic[1]+" "+tic[2] +
              "\n" + tic[3] + " " + tic[4] + " " + tic[5] +
              "\n" + tic[6] + " " + tic[7] + " " + tic[8]);


//    }
    //int rnd = new Random().nextInt(tic.length);

//    System.out.println(tic[rnd]);
//    System.out.println(tic[rnd]);
//    System.out.println(tic[rnd]);



    System.out.println("0"+" "+"X"+" "+"X");
    System.out.println("X"+" "+"0"+" "+"X");
    System.out.println("X"+" "+"0"+" "+"0");

  }
}
