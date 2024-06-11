package br.com.javastudies;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // String[] letras = new String[5];
        // letras[0] = "S";
        // letras[1] = "D";
        // letras[2] = "R";
        // letras[3] = "G";
        // letras[4] = "H";

        // String[] letras = { "A", "B", "C", "T", "I" };

        // for (int i = 0; i < letras.length; i++) {
        // System.out.println(letras[i]);
        // }

        // System.out.println(Arrays.toString(letras));

        int[] numeros = { 9, 10, 12, 25, 2 };
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            media += numeros[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + (media / numeros.length));

    }
}
