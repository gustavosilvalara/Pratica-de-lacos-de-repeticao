package br.com.alura.contandonumerospositivosenegativos;

import java.util.Scanner;

public class ContadorPositivosNegativos {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        String numero;

        do {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            numero = entrada.nextLine();
            if (!numero.equals("fim")){
                int numeroInt = Integer.parseInt(numero);
                if (numeroInt > 0){
                    positivos++;
                }else {
                    negativos++;
                }
            }
        }while (!numero.equals("fim"));

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
    }
}
