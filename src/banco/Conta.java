
package banco;

public class Conta {
    private int numeroConta, senha;
    private String nomeCliente;
    private double saldo, valorSaque, valorDeposito, valorTransferencia;

   public Conta(int numeroConta, int senha, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void getSaldo(int senha1) { 
        if (this.senha == senha1){
            System.out.println(saldo);
        }
        else{
            System.out.println("Senha inválida");
        }
    }
    public boolean sacar(double valorSaque, int senha1) {
        if (saldo > 0 && valorSaque < saldo && this.senha == senha1) { 
           saldo = saldo - valorSaque;
           return true;
        }
        else{
            return false;
        }
    }
    public boolean depositar(double valorDeposito, int senha1) {
        if (valorDeposito > 0 && this.senha == senha1) {
           saldo = saldo + valorDeposito;
           return true;
        }
        else{
            return false;
        }
    }
    public boolean transferencia(double valorTransferencia, int senha1, Conta conta2) {
        if (valorTransferencia > 0 && this.senha == senha1) {
           conta2.saldo = saldo + valorTransferencia;
           return true; 
        }
        else{
            return false;
        }
    }
}
