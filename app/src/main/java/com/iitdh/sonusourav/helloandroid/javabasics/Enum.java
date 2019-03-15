package com.iitdh.sonusourav.helloandroid.javabasics;

public class Enum {

  enum Color {
    RED, GREEN, BLUE;
  }

  public static void main(String[] args)
    {
      Color c1 = Color.RED;
      System.out.println(c1);
      Color c2 = Color.GREEN;
      System.out.println(c2);
      Color c3 = Color.BLUE;
      System.out.println(c3);
    }
}

