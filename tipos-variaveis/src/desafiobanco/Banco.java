package desafiobanco;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void impressaoContasDoBanco(){
        System.out.println("Impressão das contas dos clientes do banco " + getNome() +":");
        for (Conta c : contas){
            System.out.println("Nome: " +c.cliente.getNome());
            System.out.println("Tipo de Conta: " +c.cliente.getTipoConta());
            System.out.println("Agência: " +c.agencia);
            System.out.println("Número da Conta: " +c.numero);
            System.out.printf("Saldo da conta: %.2f\n",c.saldo);
            
            System.out.println();
        }
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    
    
}
