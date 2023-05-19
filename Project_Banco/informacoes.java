package Project_Banco;

public class informacoes {
    private double saldoAtual;
    private String nome;
    private int numeroConta;

    public void saldoAtualSet(double novoSaldo){
        saldoAtual = novoSaldo;
    }
    public void numeroContaSet(int contaNova){
        numeroConta = contaNova;
    }
    public void nomeSet(String novoNome){
        nome = novoNome;
    }

}
