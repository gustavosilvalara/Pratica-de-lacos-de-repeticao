package br.com.alura.monitoramentotentativaslogin;

import java.util.Scanner;

public class TentativasDeLogin {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int senhaGuardada = 1234;
        int tentativas = 3;

        while (tentativas >= 1) {

            System.out.print("Digite sua senha: ");
            int senha = entrada.nextInt();

            if (senha != senhaGuardada){
                tentativas--;
                System.out.println("Senha incorreta. Você tem "+ (tentativas)+
                        " tentativas restantes.");
            }else {
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            }
            if (tentativas == 0 ){
                System.out.println("Conta bloqueada temporariamente.");
                break;
            }
        }
    }
}