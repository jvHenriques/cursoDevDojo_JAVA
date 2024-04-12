package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{
    private static final double imposto = 0.06;
    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calculoImposto() {
        System.out.println("Calculando imposto do produto...");
        return preco * imposto;
    }
}
