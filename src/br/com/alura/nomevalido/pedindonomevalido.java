package br.com.alura.nomevalido;

import java.util.Scanner;

public class pedindonomevalido {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        while (true){
            System.out.print("Digite seu nome: ");
            String nome = entrada.nextLine();

            if (nome.isBlank() || nome.length() < 3){
                System.out.println("Nome inválido. Digite novamente.");
            }else {
                System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
                break;
            }
        }
    }
}
