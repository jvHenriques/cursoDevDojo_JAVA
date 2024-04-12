package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("ASUS-013", 6700.00);
        Tomate tomate = new Tomate("Tomate cistalino", 10);
        Televisao tv = new Televisao("SAMSUNG 50\" ", 8000);


        CalculadoraImposto.chamacalculo(computador);
        CalculadoraImposto.chamacalculo(tomate);
        CalculadoraImposto.chamacalculo(tv);

    }
}
