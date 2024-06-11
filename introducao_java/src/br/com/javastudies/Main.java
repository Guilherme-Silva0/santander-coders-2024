package br.com.javastudies;

public class Main {
    public static void main(String[] args) {
        boolean fimDeSemana = false;
        boolean fazendoSol = true;

        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println("Vamos à praia? " + vamosAPraia);

        String menssagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(menssagem);
    }
}
