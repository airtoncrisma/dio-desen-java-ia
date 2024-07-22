package edu.airton.collection.list.Ordenacao;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa>{

        public int compare(Pessoa p1, Pessoa p2){
            return Double.compare(p1.getAltura(), p2.getAltura());
        }

}
