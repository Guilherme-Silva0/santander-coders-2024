package main;

import dataStructure.Stack;

public class Main {
  public static void main(String[] args) {
    int[] numeros = { 5, 4, 3, 2, 1 };

    invert(numeros);
  }

  public static void invert(final int[] numbers) {
    Stack stack = new Stack(numbers[0]);

    for (int i = 1; i < numbers.length; i++) {
      stack.push(numbers[i]);
    }

    var node = stack.pop();
    while (node != null) {
      System.out.println(node.getValue());
      node = stack.pop();
    }
  }
}
