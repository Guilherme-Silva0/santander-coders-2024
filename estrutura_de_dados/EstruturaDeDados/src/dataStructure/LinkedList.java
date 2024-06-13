package dataStructure;

public class LinkedList {

  private Node head;
  private Node tail;
  private int length;

  public class Node {
    String data;
    Node next;

    public Node(String data) {
      this.data = data;
    }
  }

  public LinkedList(String data) {
    Node newNode = new Node(data);
    head = newNode;
    tail = newNode;
    length = 1;
  }

  public void getHead() {
    if (head == null) {
      System.out.println("Lista vazia");
      return;
    }
    System.out.println("Head: " + head.data);
  }

  public void getTail() {
    if (head == null) {
      System.out.println("Lista vazia");
      return;
    }
    System.out.println("Tail: " + tail.data);
  }

  public void getLength() {
    System.out.println("Length: " + length);
  }

  public void makeEmpty() {
    head = null;
    tail = null;
    length = 0;
  }

  public void printList() {
    System.out.println("##########################");
    if (head == null) {
      System.out.println("Lista vazia");
      return;
    }
    Node currentNode = head;
    while (currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }
    System.out.println("##########################");
  }

  public void append(String data) {
    Node newNode = new Node(data);
    if (length == 0) {
      head = newNode;
      tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;

    length++;
  }

  public Node removeLast() {
    if (length == 0) {
      return null;
    }

    Node pre = head;
    Node temp = null;
    while (pre.next != tail) {
      pre = pre.next;
    }

    temp = tail;
    tail = pre;
    tail.next = null;

    length--;
    if (length == 0) {
      head = null;
      tail = null;
    }

    return temp;
  }

  public void prepend(String data) {
    Node newNode = new Node(data);
    if (length == 0) {
      head = newNode;
      tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
    length++;
  }

  public Node removeFirst() {
    if (length == 0) {
      return null;
    }

    Node temp = head;
    head = head.next;
    temp.next = null;
    length--;
    if (length == 0) {
      head = null;
      tail = null;
    }

    return temp;
  }

  public Node get(int index) {
    if (index < 0 || index >= length) {
      return null;
    }

    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }

    return temp;
  }

  public boolean insert(int index, String value) {
    if (index < 0 || index > length)
      return false;

    if (index == 0) {
      prepend(value);
      return true;
    }

    if (index == length) {
      append(value);
      return true;
    }

    Node newNode = new Node(value);
    Node temp = get(index - 1);
    newNode.next = temp.next;
    temp.next = newNode;
    length++;
    return true;
  }

  public boolean set(int index, String data) {
    Node temp = get(index);
    if (temp != null) {
      temp.data = data;
      return true;
    }

    return false;
  }

  public Node remove(int index) {
    if (index < 0 || index > length) {
      return null;
    }

    if (index == 0) {
      return removeFirst();
    }

    if (index == length) {
      return removeLast();
    }

    Node prev = get(index - 1);
    Node temp = prev.next;
    prev.next = temp.next;
    temp.next = null;
    length--;
    return temp;
  }

  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.flush();

    LinkedList list = new LinkedList("elemento 1");
    list.append("elemento 2");
    list.append("elemento 3");

    list.printList();

    list.prepend("elemento 0");

    System.out.println(list.get(2).data);

    list.insert(3, "elemento 2.5");

    list.set(1, "elemento 0.5");

    list.remove(2);

    // System.out.println("Removeu o elemento: " + list.removeFirst().data);

    // list.getHead();
    // list.getTail();
    // list.getLength();
    list.printList();
  }
}
