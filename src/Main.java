import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o numero da agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Informe o nome do cliente: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        Cliente cliente = new Cliente(numeroConta, agencia, nomeCliente, saldo);
        cliente.mostraDados();
        scanner.close();

        ProcessoSeletivo novoFuncionario = new ProcessoSeletivo("Adsandro", 1000);
        novoFuncionario.analisaCandidato();
    }
}
