package edu.airton.Enums;

// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbge {
	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
		   System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
		
		//selecionando um estado a partir das opções disponíveis
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.BAHIA;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
        System.out.println("A sigla é : " + ufSelecionado.getSigla());
        System.out.println("O estado selecionado foi: " + ufSelecionado.getNomeMaiusculo());
        System.out.println("O codigo do Ibge foi: " + ufSelecionado.getIbge());
    }
}
