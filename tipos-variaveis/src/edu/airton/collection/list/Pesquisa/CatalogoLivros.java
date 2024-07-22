package edu.airton.collection.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributos

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro t : livroList) {
                if (!t.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(t);
                }
            }
        }
        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro t : livroList) {
                if(t.getAnoPublicacao() >= anoInicial && t.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(t);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPortitulo = null;
        if(!livroList.isEmpty()){
            for(Livro t : livroList){
                if (t.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPortitulo = t;
                    break;
                }
            }
        }
        return livroPortitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivros("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 4", 1994);
        
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }

    
}
