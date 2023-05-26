package Project_Banco;
import java.util.Scanner;

public class Banco_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        informacoes informacoes = new informacoes();

        System.out.println("Informe seu nome:");
        informacoes.setNome(scanner.next());
        System.out.println("Informe o numero da conta: ");
        informacoes.setNumeroConta(scanner.nextInt());
        System.out.println("Informe o saldo inicial: ");
        informacoes.setSaldoAtual(scanner.nextDouble());
        
        System.out.println("Conta bancária criada com sucesso.");
        System.out.println("-----------------------------------");

        System.out.println("Qual operação deseja fazer? \nDepositar(1)\nSacar(2)\nMostral Saldo(3)");
        int opcao = scanner.nextInt();

        if(opcao == 3){
            System.out.println("Seu saldo atual é de: " + informacoes.getSaldoAtual());
        }
        if(opcao == 2){
            System.out.println("Insira o valor que deseja sacar: ");
            double saque = scanner.nextDouble();
            if(saque > informacoes.getSaldoAtual()){
                System.out.println("Saldo insuficiente para realizar a operação.");
            }
            else if(saque > 5000){
                System.out.println("Valor do saque acima do permitido.");
            }
            else{
            informacoes.setSaldoAtual(informacoes.getSaldoAtual() - saque);
            System.out.println("Saldo após o saque: " + informacoes.getSaldoAtual());
            }
        }
        if(opcao == 1){
            System.out.println("Insira o valor a ser depositado: ");
            double deposito = scanner.nextDouble();
            informacoes.setSaldoAtual(informacoes.getSaldoAtual() + deposito);
            System.out.println("Saldo após o deposito: " + informacoes.getSaldoAtual());
            
        }
        scanner.close();
    }   
}
