import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 21, 26.5, 5);
        System.out.println("Cachorros totais: " + Cachorro.getTotalCachorros());

        Cachorro cachorro2 = new Cachorro("Puppy", "Marron", 23, 27.5, 5);
        System.out.println("Cachorros totais: " + Cachorro.getTotalCachorros());

        cachorro1.latir();
        cachorro2.latir();
    }
}