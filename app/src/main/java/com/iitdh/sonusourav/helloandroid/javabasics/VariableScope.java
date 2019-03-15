package com.iitdh.sonusourav.helloandroid.javabasics;

public class VariableScope {

  public static void main(String args[])
  {
    {
      int x = 10;                             // The variable x has scope within brackets
      System.out.println(x);
    }

    // System.out.println(x);                // Uncommenting this line would produce error since variable x is out of scope.


  }

}
