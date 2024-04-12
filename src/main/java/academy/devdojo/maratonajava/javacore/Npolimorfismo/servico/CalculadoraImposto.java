package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void chamacalculo(Produto produto){
        System.out.println("RELATORIO IMPOSTO PRODUTO: " + produto.getNome());
        double imposto = produto.calculoImposto();
        System.out.println("valor produto: " + produto.getPreco());
        System.out.println("imposto do produto: " + imposto);
        System.out.println("valor total da compra: " + (produto.getPreco() + imposto));
        System.out.println("------------------------------");
    }

    // isso ^^ | substitui isso vv                ||||| um polimorfismo

//    public static void chamacalculo(Computador computador){
//        System.out.println("produto" + computador.getNome());
//        double imposto = computador.calculoImposto();
//        System.out.println("valor do produto: " +computador.getPreco());
//        System.out.println("imposto do produto: " +imposto);
//    }
//    public static void chamacalculo(Tomate tomate){
//        System.out.println("produto" + tomate.getNome());
//        double imposto = tomate.calculoImposto();
//        System.out.println("valor do produto: " +tomate.getPreco());
//        System.out.println("imposto do produto: " +imposto);
//    }
}
