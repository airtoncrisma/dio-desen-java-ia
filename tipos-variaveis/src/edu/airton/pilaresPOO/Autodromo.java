package edu.airton.pilaresPOO;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        // jeep.confereCambio();
        // jeep.confereCombustivel();
        jeep.setChassi("897897");
        // jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("123548987");
        // z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}
