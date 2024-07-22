package edu.airton.collection.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class Listatarefa {
    // atributo
    private List<Tarefa> tarefalist;

    public Listatarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefalist){
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefalist);
    }
    public static void main(String[] args) {
        Listatarefa listatarefa = new Listatarefa();
       
        System.out.println("o numero total de elementos na lista é: " + listatarefa.obterNumeroTotalTarefas());
    
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 2");
        System.out.println("o numero total de elementos na lista é: " + listatarefa.obterNumeroTotalTarefas());
        
        listatarefa.removerTarefa("Tarefa 2");
        System.out.println("o numero total de elementos na lista é: " + listatarefa.obterNumeroTotalTarefas());
    
        listatarefa.obterDescricoesTarefas();
    }

}
