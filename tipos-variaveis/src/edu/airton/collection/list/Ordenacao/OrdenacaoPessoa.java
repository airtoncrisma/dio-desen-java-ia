package edu.airton.collection.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.airton.collection.list.Ordenacao.Pessoa.ComporatorPorAltura;

@SuppressWarnings("unused")
public class OrdenacaoPessoa {
// atributo
private List<Pessoa> pessoalist;

public OrdenacaoPessoa(){
    this.pessoalist = new ArrayList<>();
}
public void adicionarPessoa(String nome, int idade, double altura ){
    pessoalist.add(new Pessoa(nome, idade, altura));
}

public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoaPorIdade = new ArrayList<>();
    Collections.sort(pessoaPorIdade);
    return pessoaPorIdade;
}

public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>();
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
}

public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
    ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
    ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
    ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
    ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);
    ordenacaoPessoa.adicionarPessoa("Nome 5", 50, 1.69);

    // System.out.println(ordenacaoPessoa.pessoalist);
    System.out.println(ordenacaoPessoa.ordenarPorIdade());
    System.out.println(ordenacaoPessoa.ordenarPorAltura());
}

}
