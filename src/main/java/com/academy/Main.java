package com.academy;

import com.academy.ui.UI;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    UI ui = new UI();

    int number1 = ui.readNumber();
    int number2 = ui.readNumber();

    calculator.sum(number1, number2);
  }
}
