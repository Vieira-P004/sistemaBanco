import java.util.Scanner;

class ContaBancaria{
    String titular;
    double saldo;

    //construtor
    public ContaBancaria(String dono, double conta){

        this.titular = dono;
        this.saldo = conta;
    }

    //métodos

    public double deposito(double valor){
        return this.saldo = valor + this.saldo;
    }

    public double sacar (double sacarDinheiro){

        double saldoConta = this.saldo;

        if (sacarDinheiro < this.saldo){
            saldoConta =  this.saldo = this.saldo - sacarDinheiro;
        }

        return saldoConta;
    }

    public void exibir ( ){
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("-------------------------");
    }

}

public class SistemaBancario {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nomeConta = input.nextLine();
        System.out.println("Informe o saldo na conta: ");
        double valorConta = input.nextDouble();

        ContaBancaria conta1 = new ContaBancaria(nomeConta,valorConta);

        conta1.deposito(50);
        conta1.exibir();
        conta1.sacar(20);
        conta1.exibir();


    }

}
