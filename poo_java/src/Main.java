import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Puppy";
        cachorro.cor = "marrom";
        cachorro.altura = 23;
        cachorro.peso = 27.5;
        cachorro.tamanhoDoRabo = 5;

        System.out.println(cachorro);
    }
}