package com.academy;

import lombok.Data;

@Data
public class Calculator {
  public static int memory;

  public int sum(int a, int b) {
    int result = a + b;
    memory += result;

    return memory;
  }

  public int substract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
//    if (b == 0) {
//      return 0;
//    }
    return a / b;
  }
}
