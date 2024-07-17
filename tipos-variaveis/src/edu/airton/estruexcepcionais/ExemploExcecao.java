package edu.airton.estruexcepcionais;


// try {
//     //  bloco de código conforme esperado
//   }
//   catch(Exception e) {// precisamos saber qual exceção
//     // bloco de código que captura as exceções que podem acontecer
//     // em caso de um fluxo não previsto
//   }
public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        valor = NumberFormat.getInstance().parse("a1.75");
        
        System.out.println(valor);
       
    }
}