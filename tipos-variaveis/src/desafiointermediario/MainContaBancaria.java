package desafiointermediario;

import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Criar uma nova conta bancária com o saldo inicial
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {

    // TODO: Crie uma variável para armazenar o saldo da conta
    private double saldo;

// TODO: Crie o construtor que inicializa a conta com um saldo inicial fornecido pelo usuário:
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para realizar depósito na conta:
    public void depositar(double valor) {
        // Aqui é incrementado o saldo da conta com o valor do depósito:
        this.saldo += valor;
        // É impresso uma mensagem indicando que o depósito foi feito:
        System.out.println("Deposito feito.");
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        } else {
            this.saldo -= valor;
        // Se sim, atualizar o saldo e imprimir "Saque feito."
        // Se não, imprimir "Saldo insuficiente. Saque não realizado."
        System.out.println("Saque feito.");
    }
}

// Método para obter o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }
}
