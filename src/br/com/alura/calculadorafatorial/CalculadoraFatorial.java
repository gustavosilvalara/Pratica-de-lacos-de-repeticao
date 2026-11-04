package br.com.alura.calculadorafatorial;

import java.util.Scanner;

public class CalculadoraFatorial {
    static void main() {
        Scanner input = new Scanner(System.in);
        int resultadoFatorial = 1;

        System.out.print("Digite um número: ");
        int fatorial = input.nextInt();

        for (int i = fatorial; i > 0 ; i--) {
            resultadoFatorial *= i;
        }
        System.out.println("O fatorial de " + fatorial + " é: " + resultadoFatorial);
        input.close();
    }
}
