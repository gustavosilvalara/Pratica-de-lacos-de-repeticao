package br.com.alura.somadenumeros;

public class SomaNumeros {
    static void main() {
        int[] valores = {10, 20 , 30, 40, 50};
        int total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        System.out.println("A soma total das receitas é: " + total);
    }
}
