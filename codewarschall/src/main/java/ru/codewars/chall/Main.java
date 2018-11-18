package ru.codewars.chall;


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int width = scanner.nextInt();
    int height = scanner.nextInt();
    int length = scanner.nextInt();

    // creating an instance
    //cube(int width, int height, ){}
    GeometricCube cube = new GeometricCube();
    cube.setWidth(width);
    cube.setHeight(height);
    cube.setLength(length);

    System.out.println(cube.toString());
  }
}

class GeometricCube {
  private int width;
  private int height;
  private int length;

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int getLength() {
    return length;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setLength(int length) {
    this.length = length;
  }


  public GeometricCube() {
    this.width = width;
    this.height = height;
    this.length = length;
  }

  @Override
  public String toString() {
    return "Cube(" +
            "w=" + width +
            ", h=" + height +
            ", l=" + length + ')';
  }

}
