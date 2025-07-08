public class ContaBancaria {
    private Cliente cliente;
    private double saldo;
    private double chequeEspecial;
    private double chequeEspecialUsado = 0;

    public ContaBancaria(Cliente cliente, double valorInicial) {
        this.cliente = cliente;
        this.saldo = valorInicial;

        if (valorInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = valorInicial * 0.5;
        }
    }

    public void consultarSaldo() {
        System.out.println(cliente.getNome() + ", seu saldo é: R$" + saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("Cheque especial disponível: R$" + (chequeEspecial - chequeEspecialUsado));
    }

    public void sacar(double valor) {
        if (saldo + (chequeEspecial - chequeEspecialUsado) >= valor) {
            saldo -= valor;

            if (saldo < 0) {
                chequeEspecialUsado = -saldo;
            }

            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo + cheque especial insuficientes para sacar R$" + valor);
        }
    }

    public void depositar(double valor) {
        saldo += valor;

        if (chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * 0.2;
            double totalPagar = chequeEspecialUsado + taxa;

            if (saldo >= totalPagar) {
                saldo -= totalPagar;
                chequeEspecialUsado = 0;
                System.out.println("Taxa de 20% cobrada: R$" + taxa);
            } else {
                System.out.println("Saldo insuficiente para quitar o cheque especial com taxa.");
            }
        } else {
            System.out.println("Depósito realizado com sucesso.");
        }
    }

    public void pagarBoleto(double valor) {
        System.out.println("Pagamento de boleto de R$" + valor);
        sacar(valor);
    }

    public void verificarUsoChequeEspecial() {
        if (saldo < 0) {
            System.out.println("Você está usando o cheque especial!");
        } else {
            System.out.println("Você NÃO está usando o cheque especial.");
        }
    }
}
