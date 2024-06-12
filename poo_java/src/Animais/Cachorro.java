package Animais;

public class Cachorro extends Animal {
  private static int totalCachorros = 0;
  private int tamanhoDoRabo;

  public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
    super(nome, cor, altura, peso);
    this.tamanhoDoRabo = tamanhoDoRabo;
    totalCachorros++;
  }

  public String pegar() {
    return "Bolinha";
  }

  @Override
  public void soar() {
    System.out.println("AU AU");
  }

  public String interagir(String acao) {
    switch (acao) {
      case "carinho":
        this.estadoDeEspirito = "feliz";
        break;
      case "mandar dormir":
        this.estadoDeEspirito = "bravo";
        break;
      case "pisar na patinha":
        this.estadoDeEspirito = "triste";
        break;
      default:
        this.estadoDeEspirito = "neutro";
        break;
    }

    return this.estadoDeEspirito;
  }

  public int getTamanhoDoRabo() {
    return this.tamanhoDoRabo;
  }

  public void setTamanhoDoRabo(int tamanhoDoRabo) {
    this.tamanhoDoRabo = tamanhoDoRabo;
  }

  public static int getTotalCachorros() {
    return totalCachorros;
  }

  public static void setTotalCachorros(int totalCachorros) {
    Cachorro.totalCachorros = totalCachorros;
  }

  @Override
  public String toString() {
    return "{" +
        " nome='" + getNome() + "'" +
        "}";
  }

  @Override
  public void comer() {
    throw new UnsupportedOperationException("Unimplemented method 'comer'");
  }

  @Override
  public void dormir() {
    throw new UnsupportedOperationException("Unimplemented method 'dormir'");
  }

}
