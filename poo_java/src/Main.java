import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.PetShop;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 21, 26.5, 5);

        Gato gato1 = new Gato("Felix", "Amarelo", 18, 4.5);

        Passaro passaro1 = new Passaro("Papagaio", "Vermelho", 10, 0.5);

        PetShop petShop = new PetShop();
        petShop.tosar(cachorro1);
        petShop.darBanho(gato1);
        petShop.deixarNoHotel(passaro1);

        System.out.println(cachorro1.getEstadoDeEspirito());
        System.out.println(gato1.getEstadoDeEspirito());
        System.out.println(passaro1.getEstadoDeEspirito());

        System.out.println();

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}