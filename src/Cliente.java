import java.util.Scanner;
public class Cliente {
    private int numeroConta;
    private int agencia;
    private String nomeCliente;
    private double saldo;

    public Cliente(int numeroConta, int agencia, String nomeCliente, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public void mostraDados(){
        System.out.println("Numero da conta: " + getNumeroConta() + "\n" +
                            "Agencia: " + getAgencia() + "\n" +
                            "Nome do cliente: " + getNomeCliente() + "\n" +
                            "Saldo: " + getSaldo() + "\n"
        );
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
