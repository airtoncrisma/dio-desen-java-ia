package desafiobanco;

public class Main {
    public static void main(String[] args) {
        Cliente airton = new Cliente();
        airton.setNome("Airton");


        iConta cc = new ContaCorrente(airton);
        cc.depositar(100);
        
        iConta poupancao = new ContaPoupanca(airton);

        cc.transferir(100, poupancao);
        cc.imprimirExtrato();
        poupancao.imprimirExtrato();
    }

}
