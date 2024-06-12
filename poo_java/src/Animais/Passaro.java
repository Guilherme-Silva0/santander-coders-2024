package Animais;

public class Passaro extends Animal {
  private static int totalPassaros = 0;

  public Passaro(String nome, String cor, int altura, double peso) {
    super(nome, cor, altura, peso);
  }

  @Override
  public void soar() {
    System.out.println("PIU PIU");
  }

  public static int getTotalPassaros() {
    return totalPassaros;
  }

  public static void setTotalPassaros(int totalPassaros) {
    Passaro.totalPassaros = totalPassaros;
  }

}