package dataStructure;

public class Queue {
  private Node first;
  private Node last;
  private int length;

  public class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  public Queue(int value) {
    Node newNode = new Node(value);
    first = newNode;
    last = newNode;
    length++;
  }

  public void getFirst() {
    if (first == null) {
      System.out.println("A fila está vazia");
      return;
    }
    System.out.println("First: " + first.value);
  }

  public void getLast() {
    if (last == null) {
      System.out.println("A fila está vazia");
      return;
    }
    System.out.println("Last: " + last.value);
  }

  public void getLength() {
    System.out.println("Tamanho: " + length);
  }

  public void print() {
    System.out.println("############################");
    Node temp = first;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
    System.out.println("############################");
  }

  public void enqueue(int value) {
    Node newNode = new Node(value);

    if (length == 0) {
      first = newNode;
      last = newNode;
      length = 1;
      return;
    }

    last.next = newNode;
    last = newNode;
    length++;
  }

  public Node dequeue() {
    if (length == 0)
      return null;
    Node temp = first;

    if (length == 1) {
      first = null;
      last = null;
    } else {
      first = first.next;
      temp.next = null;
    }

    length--;
    return temp;
  }

  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    Queue myQueue = new Queue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    myQueue.enqueue(4);
    myQueue.enqueue(5);

    System.out.println("Valor removido: " + myQueue.dequeue().value);

    myQueue.getFirst();
    myQueue.getLast();
    myQueue.getLength();
    myQueue.print();
  }
}
