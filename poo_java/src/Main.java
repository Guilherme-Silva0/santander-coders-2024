import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Puppy";
        cachorro.cor = "marrom";
        cachorro.altura = 23;
        cachorro.peso = 27.5;
        cachorro.tamanhoDoRabo = 5;

        cachorro.latir();
        System.out.println("O cachorro pegou uma " + cachorro.pegar());

        System.out.println("O cachorro está " + cachorro.interagir("carinho"));

        System.out.println("O cachorro está " + cachorro.interagir("mandar dormir"));

        System.out.println("O cachorro está " + cachorro.interagir("nada"));
    }
}