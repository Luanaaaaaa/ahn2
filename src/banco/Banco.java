import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta conta1;
        Conta conta2;

        conta1 = new Conta();

        conta2 = new Conta();


        int opção =  teclado.nextInt();
        while (opção != 5){
            if (opção == 1){
                conta1.getSaldo(int senha = teclado.nextInt());
            }
            if (opção == 2){
                if (conta1.sacar(double valorSaque = teclado.nextDouble(), int senha = teclado.nextInt()) == true){
                    System.out.println("Saque realizado");
                }
                else{
                    System.out.println("Saque não realizado");
                }
            }
            if (opção == 3){
                if (conta1.depositar(double valorDeposito = teclado.nextDouble(), int senha = teclado.nextInt()) == true){
                    System.out.println("Depósito realizado");
                }
                else{
                    System.out.println("Depósito não realizado");
                }
            }
            if (opção == 4){
                if (conta1.transferencia(double valorTransferencia = teclado.nextDouble(), int senha = teclado.nextInt(), conta2 = teclado.nextInt()) == true){
                    System.out.println("Transferência realizada");
                }
                else{
                    System.out.println("Transferência não realizada");
                }
            } 
        }
    }
}