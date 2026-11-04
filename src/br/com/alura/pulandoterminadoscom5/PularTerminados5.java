package br.com.alura.pulandoterminadoscom5;

import java.util.Scanner;

public class PularTerminados5 {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        for (int i = 0; i <= numero; i++) {
            if (i % 10 == 5){
                continue;
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
