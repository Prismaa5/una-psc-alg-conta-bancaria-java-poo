package Project_Banco;
import java.util.Scanner;

public class Banco_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        informacoes informacoes = new informacoes();

        System.out.println("Informe seu nome:");
        informacoes.nomeSet(scanner.next());
        System.out.println("Informe o numero da conta: ");
        informacoes.numeroContaSet(scanner.nextInt());
        System.out.println("Informe o saldo inicial: ");
        informacoes.saldoAtualSet(scanner.nextDouble());

        
    }   
}
