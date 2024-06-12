import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 21, 26.5, 5);
        cachorro1.soar();

        Gato gato1 = new Gato("Felix", "Amarelo", 18, 4.5);
        gato1.soar();

        Passaro passaro1 = new Passaro("Papagaio", "Vermelho", 10, 0.5);
        passaro1.soar();
    }
}