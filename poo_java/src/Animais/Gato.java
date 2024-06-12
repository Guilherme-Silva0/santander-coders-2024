package Animais;

public class Gato extends Animal {
  private static int totalGatos = 0;

  public Gato(String nome, String cor, int altura, double peso) {
    super(nome, cor, altura, peso);
  }

  @Override
  public void soar() {
    System.out.println("MIAU");
  }

  public static int getTotalGatos() {
    return totalGatos;
  }

  public static void setTotalGatos(int totalGatos) {
    Gato.totalGatos = totalGatos;
  }

}