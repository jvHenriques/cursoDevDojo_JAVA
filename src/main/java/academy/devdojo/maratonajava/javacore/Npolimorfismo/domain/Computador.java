package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computador extends Produto{
    private static final double imposto = 0.21;
    public Computador(String nome, double preco) {
        super(nome, preco);
    }


    //// isso foi evitado |vvv| usando o polimorfismo na/da classe calculadoraImposto

//    public void relatorio(){
//        System.out.println("RELATORIO PRODUTO COMPRADO!");
//        System.out.println("nome produto!" + getNome());
//        System.out.println("preço produto: " + getPreco());
//        System.out.println("imposto produto: " + calculoImposto());
//    }

    @Override
    public double calculoImposto() {
        System.out.println("Calculando imposto do produto...");
        return preco * imposto;
    }
}
