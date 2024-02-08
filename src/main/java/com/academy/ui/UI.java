package com.academy.ui;

import java.util.Scanner;

public class UI {
  public int readNumber() {
    System.out.println("Please enter digit");
    Scanner in = new Scanner(System.in);
    return in.nextInt();
  }
}
