package main;

import java.util.Random;

import dataStructure.Queue;

public class FilaDeAtendimento {
  public static void main(String[] args) throws InterruptedException {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    int n = 5;

    System.out.println("Esperando clientes...");
    Thread.sleep(3500);

    var random = new Random();
    int client = random.nextInt(101);
    Queue queue = new Queue(client);
    System.out.println("Chegou o cliente: " + client);

    for (int i = 2; i <= n; i++) {
      Thread.sleep(1500);
      client = random.nextInt(101);
      System.out.println("Chegou o cliente: " + client);
      queue.enqueue(client);
    }

    var node = queue.dequeue();
    while (node != null) {
      Thread.sleep(1500);
      System.out.println("Atendido o cliente: " + node.getValue());
      node = queue.dequeue();
    }
  }
}
