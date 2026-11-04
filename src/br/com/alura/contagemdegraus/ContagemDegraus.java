package br.com.alura.contagemdegraus;

import java.util.Scanner;

public class ContagemDegraus {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        int quantidadeDegraus = input.nextInt();

       for (int i = 1; i <= quantidadeDegraus; i++) {
            System.out.println("Subindo o degrau " +  i);
        }
        System.out.println("Você chegou ao topo!");
    }
}
