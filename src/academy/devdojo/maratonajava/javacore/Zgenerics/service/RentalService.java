package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {

    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto disponível...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("objeto disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarCarroAlugado(T t){
        System.out.println("devolvendo objeto: " +t);
        objetosDisponiveis.add(t);
        System.out.println("objeto disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}

