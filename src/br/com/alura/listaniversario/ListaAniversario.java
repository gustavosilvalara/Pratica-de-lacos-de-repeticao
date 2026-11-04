package br.com.alura.listaniversario;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaAniversario {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();

        while(true){
            System.out.print("Digite o nome do convidado (ou 'ver' para" +
                                " visualizar a lista, 'sair' para terminar): ");
            String convidado = entrada.nextLine();

            if (convidado.equalsIgnoreCase("sair")){
                break;
            } else if (convidado.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            boolean jaExiste = false;
            for (String convidadoVerificacao : convidados) {
                if (convidadoVerificacao.equalsIgnoreCase(convidado)) {
                    jaExiste = true;
                    break;
                }
            }
            if (jaExiste){
                System.out.println("O nome "+ convidado + " já está na lista de convidados.");
            }else {
                convidados.add(convidado);
                System.out.println(convidado + " foi adicionado à lista de convidados.");
            }
        }
        System.out.println("Programa finalizado.");
    }
}
