package edu.airton.estrucondicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.00;
        double valorSolicitado = 27.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }else
        System.out.println("Saldo insuficiente");
        
    }
}
