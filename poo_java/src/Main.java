import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "marrom", 23, 27.5, 5);

        cachorro.setNome("Puppy");
        cachorro.setCor("marrom");
        cachorro.setAltura(23);
        cachorro.setPeso(27.5);
        cachorro.setTamanhoDoRabo(5);

        System.out.println("O cachorro está " + cachorro.interagir("carinho"));

        System.out.println("O cachorro está " + cachorro.interagir("mandar dormir"));

        System.out.println("O cachorro está " + cachorro.interagir("pisar na patinha"));

        System.out.println("O cachorro está " + cachorro.interagir("nada"));

        System.out.println("Nome do segundo cachorro: " + cachorro2.getNome());
    }
}