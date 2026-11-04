package br.com.alura.encontrandomaironumeros;

import java.util.Scanner;

public class EcontrandoMaiorNumero {
    static void main() {
        Scanner input = new Scanner(System.in);
        int numeroMaior = Integer.MIN_VALUE;

        System.out.print("Digite os números separados por espaço: ");
        String[] numerosString = input.nextLine().split(" ");

        for (String numero : numerosString){
            int numeroConvetido = Integer.parseInt(numero);
            if (numeroConvetido > numeroMaior){
                numeroMaior = numeroConvetido;
            }
        }
        System.out.println("O maior número é: " + numeroMaior);
    }
}
