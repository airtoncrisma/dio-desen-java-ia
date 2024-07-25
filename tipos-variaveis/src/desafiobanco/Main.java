package desafiobanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
     * <h1>Desenvolvendo um Banco Digital com Java e POO</h1>
     * Desafio de projeto da DIO
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Airton Crisma Loureiro dos Santos
     * @version 1.0
     * @since   25/07/2024
     */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        System.out.print("Digite o nome do banco: ");
        String nomeDoBanco = scanner.nextLine();
        banco.setNome(nomeDoBanco);
        List<Conta> listaDeContas = new ArrayList<>();
        String nomeCliente, cpfCliente, profissaoCliente, telefoneCliente, tipoConta;
        char opSimOuNao;
        tipoConta = null;
        Conta cc1 = null;
        Conta cp1 = null;
        Conta cc2 = null;
        Conta cp2 = null;
        Cliente cliente1 = null;
        Cliente cliente2 = null;
        int op1=0, op2=0;
        banco.setNome(nomeDoBanco);

        for (int i = 0; i< 2; i++){

            System.out.print("Insira o nome do Cliente: ");
            nomeCliente = scanner.nextLine();
            System.out.print("Insira o cpf do Cliente: ");
            cpfCliente = scanner.nextLine();
            System.out.print("Insira a profissão do Cliente: ");
            profissaoCliente = scanner.nextLine();
            System.out.print("Insira o telefone do Cliente: ");
            telefoneCliente = scanner.nextLine();
            System.out.println("Escolha o tipo da conta do cliente: ");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("Digite a opção da conta:");
            int opcaoConta = scanner.nextInt();
            System.out.println("Insira o valor do depósito da conta " + nomeCliente + ":");
            double valorDeposito = scanner.nextDouble();
            if(i==0 && opcaoConta==1){
                op1 =1;
                TipoDeConta tipoDeContaEnum = TipoDeConta.CONTA_CORRENTE;
                tipoConta = tipoDeContaEnum.getTipoDeConta();
                cliente1 = new Cliente(nomeCliente, cpfCliente, profissaoCliente, telefoneCliente, tipoConta);
                cc1 = new ContaCorrente(cliente1);
                cc1.depositar(valorDeposito);
            } else if (i==0 && opcaoConta==2) {
                op1 =2;
                TipoDeConta tipoDeContaEnum = TipoDeConta.CONTA_POUPANÇA;
                tipoConta = tipoDeContaEnum.getTipoDeConta();
                cliente1 = new Cliente(nomeCliente, cpfCliente, profissaoCliente, telefoneCliente, tipoConta);
                cp1 = new ContaPoupanca(cliente1);
                cp1.depositar(valorDeposito);
            }else if (i==1 && opcaoConta==1) {
                op2 =1;
                TipoDeConta tipoDeContaEnum = TipoDeConta.CONTA_CORRENTE;
                tipoConta = tipoDeContaEnum.getTipoDeConta();
                cliente2 = new Cliente(nomeCliente, cpfCliente, profissaoCliente, telefoneCliente, tipoConta);
                cc2 = new ContaCorrente(cliente2);
                cc2.depositar(valorDeposito);
            }else if (i==1 && opcaoConta==2) {
                op2 =2;
                TipoDeConta tipoDeContaEnum = TipoDeConta.CONTA_POUPANÇA;
                tipoConta = tipoDeContaEnum.getTipoDeConta();
                cliente2 = new Cliente(nomeCliente, cpfCliente, profissaoCliente, telefoneCliente, tipoConta);
                cp2 = new ContaPoupanca(cliente2);
                cp2.depositar(valorDeposito);
            }

            scanner.nextLine();
        }
        double valorTransferencia=0;
        if (op1==1&&op2==1){
            System.out.printf("Deseja fazer um deposito na conta %s: S - Sim ou N - Não\n",cc1.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor do depósito na conta %s:\n", cc1.cliente.getNome());
                double valorDeposito = scanner.nextDouble();
                cc1.depositar(valorDeposito);
            }
            System.out.printf("Deseja fazer um deposito na conta %s: S - Sim ou N - Não\n",cc2.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor do depósito na conta %s:\n", cc2.cliente.getNome());
                double valorDeposito = scanner.nextDouble();
                cc2.depositar(valorDeposito);
            }
            System.out.printf("Deseja fazer uma transferencia na conta %s: S - Sim ou N - Não\n",cc2.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor da transferencia para conta %s:\n ",cc2.cliente.getNome());
                valorTransferencia = scanner.nextDouble();
                cc1.transferir(valorTransferencia, cc2);
            }
            System.out.printf("Deseja fazer uma transferencia na conta %s: S - Sim ou N - Não\n",cc1.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor da transferencia para conta %s:\n ",cc1.cliente.getNome());
                valorTransferencia = scanner.nextDouble();
                cc2.transferir(valorTransferencia,cc1);
            }

            listaDeContas.add(cc1);
            listaDeContas.add(cc2);
            System.out.println(cc1);
            System.out.println(cc2);
            banco.setContas(listaDeContas);

        }else if (op1==1&&op2==2){
            System.out.printf("Deseja fazer um deposito na conta %s: S - Sim ou N - Não\n",cc1.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor do depósito na conta %s:\n", cc1.cliente.getNome());
                double valorDeposito = scanner.nextDouble();
                cc1.depositar(valorDeposito);
            }
            System.out.printf("Deseja fazer um deposito na conta %s: S - Sim ou N - Não\n",cp2.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor do depósito na conta %s:\n", cp2.cliente.getNome());
                double valorDeposito = scanner.nextDouble();
                cp2.depositar(valorDeposito);
            }
            System.out.printf("Deseja fazer uma transferencia na conta %s: S - Sim ou N - Não\n",cp2.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor da transferencia para conta %s:\n ",cp2.cliente.getNome());
                valorTransferencia = scanner.nextDouble();
                cc1.transferir(valorTransferencia,cp2);
            }
            System.out.printf("Deseja fazer uma transferencia na conta %s: S - Sim ou N - Não\n",cc1.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor da transferencia para conta %s:\n ",cc1.cliente.getNome());
                valorTransferencia = scanner.nextDouble();
                cp2.transferir(valorTransferencia,cc1);
            }
            listaDeContas.add(cc1);
            listaDeContas.add(cp2);
            System.out.println(cc1);
            System.out.println(cp2);
            banco.setContas(listaDeContas);

        }else if (op1==2&&op2==1){
            System.out.printf("Deseja fazer um deposito na conta %s: S - Sim ou N - Não\n",cp1.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor do depósito na conta %s:\n", cp1.cliente.getNome());
                double valorDeposito = scanner.nextDouble();
                cp1.depositar(valorDeposito);
            }
            System.out.printf("Deseja fazer um deposito na conta %s: S - Sim ou N - Não\n",cc2.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor do depósito na conta %s:\n", cc2.cliente.getNome());
                double valorDeposito = scanner.nextDouble();
                cc2.depositar(valorDeposito);
            }
            System.out.printf("Deseja fazer uma transferencia na conta %s: S - Sim ou N - Não\n",cp1.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S') {
                System.out.printf("Insira o valor da transferencia para conta %s:\n ", cc2.cliente.getNome());
                valorTransferencia = scanner.nextDouble();
                cp1.transferir(valorTransferencia, cc2);
            }
            System.out.printf("Deseja fazer uma transferencia na conta %s: S - Sim ou N - Não\n",cp1.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S') {
                System.out.printf("Insira o valor da transferencia para conta %s:\n ", cp1.cliente.getNome());
                valorTransferencia = scanner.nextDouble();
                cc2.transferir(valorTransferencia, cp1);
            }
            listaDeContas.add(cp1);
            listaDeContas.add(cc2);
            // System.out.println(cp1);
            // System.out.println(cc2);
            banco.setContas(listaDeContas);

        }else if (op1==2&&op2==2){
            System.out.printf("Deseja fazer um deposito na conta %s: S - Sim ou N - Não\n",cp1.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor do depósito na conta %s:\n", cp1.cliente.getNome());
                double valorDeposito = scanner.nextDouble();
                cp1.depositar(valorDeposito);
            }
            System.out.printf("Deseja fazer um deposito na conta %s: S - Sim ou N - Não\n",cp2.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Insira o valor do depósito na conta %s:\n", cp2.cliente.getNome());
                double valorDeposito = scanner.nextDouble();
                cp2.depositar(valorDeposito);
            }
            System.out.printf("Deseja fazer uma transferencia na conta %s: S - Sim ou N - Não\n",cp2.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S') {
                System.out.printf("Insira o valor da transferencia para conta %s:\n ",cp2.cliente.getNome());
                valorTransferencia = scanner.nextDouble();
                cp1.transferir(valorTransferencia,cp2);
            }
            System.out.printf("Deseja fazer uma transferencia na conta %s: S - Sim ou N - Não\n",cp1.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S') {
                System.out.printf("Insira o valor da transferencia para conta %s:\n ",cp1.cliente.getNome());
                valorTransferencia = scanner.nextDouble();
                cp2.transferir(valorTransferencia,cp1);
            }

            listaDeContas.add(cp1);
            listaDeContas.add(cp2);
            //System.out.println(cp1);
            //System.out.println(cp2);
            banco.setContas(listaDeContas);
        }
        banco.impressaoContasDoBanco();
        scanner.close();
    }

}
