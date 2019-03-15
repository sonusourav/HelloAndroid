package com.iitdh.sonusourav.helloandroid.javabasics;

import java.util.Scanner;

public class InputOutput {

  public static void main(String args[]) {
    inputFunction();
    outputFunction();
  }

  private static void inputFunction(String... args)
  {
    Scanner in = new Scanner(System.in);             // Using Scanner for Getting Input from User

    System.out.println("Enter any string value ");
    String s = in.nextLine();
    System.out.println("You entered string "+s);

    System.out.println("Enter any integer value ");
    int a = in.nextInt();
    System.out.println("You entered integer "+a);

    System.out.println("Enter any float value ");
    float f = in.nextFloat();
    System.out.println("You entered float "+f);
  }

  private static void outputFunction(String... args)
  {
    int x = 5;
    int y = 10;
    System.out.println(x+y);
    System.out.println("x+y");
    System.out.println("" + x + y);
    System.out.println("5" + "10");
    System.out.println(5 + 10 + x + y);
    System.out.println("output " + (x + y));
    System.out.println("output " + x + y);
  }
}
