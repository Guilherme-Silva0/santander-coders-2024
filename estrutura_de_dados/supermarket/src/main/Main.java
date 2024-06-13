package main;

import java.util.Scanner;

import implementation.Supermarket;
import implementation.SupermarketArray;

public class Main {
  private static final int SIZE = 3;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Supermarket supermarket = new SupermarketArray(SIZE);
    int option;

    do {
      System.out.println("\nLista de compras");
      System.out.println("1 - Adicionar item");
      System.out.println("2 - Listar itens");
      System.out.println("3 - Remover item");
      System.out.println("4 - Sair");
      option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("Insira o item:");
          String item = scanner.next();
          supermarket.add(item);
          break;
        case 2:
          supermarket.print();
          break;
        case 3:
          System.out.println("Insira o índice do item:");
          int index = scanner.nextInt();
          supermarket.delete(index);
          break;
        case 4:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida");
      }

    } while (option != 4);

    scanner.close();
  }
}
