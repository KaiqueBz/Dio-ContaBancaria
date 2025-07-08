import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao Santander!");

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o valor do depósito inicial: R$");
        double valorInicial = entrada.nextDouble();

        Cliente cliente = new Cliente(nome);
        ContaBancaria conta = new ContaBancaria(cliente, valorInicial);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: R$");
                    double deposito = entrada.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 4:
                    System.out.print("Digite o valor para saque: R$");
                    double saque = entrada.nextDouble();
                    conta.sacar(saque);
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: R$");
                    double boleto = entrada.nextDouble();
                    conta.pagarBoleto(boleto);
                    break;
                case 6:
                    conta.verificarUsoChequeEspecial();
                    break;
                case 0:
                    System.out.println("Obrigado por usar nosso banco. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        entrada.close();
    }
}
