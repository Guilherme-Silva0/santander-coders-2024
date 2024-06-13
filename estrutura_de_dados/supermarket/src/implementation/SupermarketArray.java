package implementation;

public class SupermarketArray implements Supermarket {
  private final String[] items;
  private int lastIndex;

  public SupermarketArray(final int size) {
    items = new String[size];
    lastIndex = -1;
  }

  @Override
  public void add(String item) {
    if (lastIndex == items.length - 1) {
      System.err.println("Lista de supermercado cheia");
      return;
    }

    lastIndex++;
    items[lastIndex] = item;
  }

  @Override
  public void print() {
    System.out.println("###############################");
    if (lastIndex < 0) {
      System.out.println("Lista de supermercado vazia");
    }

    for (int i = 0; i <= lastIndex; i++) {
      System.out.println(i + " - " + items[i]);
    }
    System.out.println("###############################");
  }

  @Override
  public void delete(int index) {
    if (index < 0 || index > lastIndex) {
      System.err.println("Índice inválido");
      return;
    }
    shift(index);
    lastIndex--;
  }

  private void shift(int index) {
    for (int i = index; i < lastIndex; i++) {
      items[i] = items[i + 1];
    }
  }
}