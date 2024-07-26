package desafiointermediario;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {
    
    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        
        Scanner sc = new Scanner(System.in);
        String titular = sc.next();
        int numero = sc.nextInt();
        double saldo = sc.nextDouble();
        double taxaJuros = sc.nextDouble();
        ContaPoupanca contaPoupanca = new ContaPoupanca(titular, numero, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancaria {
    protected String titular;
    protected int numero;
    protected double saldo;

   
    public ContaBancaria(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }


    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
        
    }
}

class ContaPoupanca extends ContaBancaria {
    protected double taxaJuros;


    public ContaPoupanca(String titular, int numero, double saldo, double taxaJuros) {
        super(titular, numero, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        //TODO: Complementar as informações com a taxa de juros.
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros)+"%");
    }

    
}

