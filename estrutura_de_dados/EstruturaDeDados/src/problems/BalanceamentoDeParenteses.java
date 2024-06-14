package problems;

import java.util.Set;
import java.util.Stack;

public class BalanceamentoDeParenteses {
  public static boolean solve(String expression) {
    Set<Character> openSymbols = Set.of('(', '{', '[');
    Set<Character> closeSymbols = Set.of(')', '}', ']');
    Stack<Character> stack = new Stack<>();

    for (char symbol : expression.toCharArray()) {
      if (openSymbols.contains(symbol)) {
        stack.push(symbol);
      }

      if (closeSymbols.contains(symbol)) {
        if (stack.isEmpty()) {
          return false;
        }

        var open = stack.pop();
        if (open == '(' && symbol != ')') {
          return false;
        }

        if (open == '{' && symbol != '}') {
          return false;
        }

        if (open == '[' && symbol != ']') {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(solve("2*(3+4*5+(2*3)]"));
    System.out.println(solve("2*(3+4*5+(2*3))/(1/(2+3)+(7-5)+x)[(5+8/1)+7]*2"));
  }
}
