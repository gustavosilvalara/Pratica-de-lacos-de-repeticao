package br.com.alura.somanumerospares;

public class SomaNumerosPares {
    static void main() {
        int somaNumeros = 0;

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
            somaNumeros += i;
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + somaNumeros);
    }
}
