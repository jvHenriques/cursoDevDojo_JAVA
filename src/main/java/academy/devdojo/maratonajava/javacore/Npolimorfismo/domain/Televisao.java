package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Televisao extends Produto{
    private static final double imposto = 0.21;
    public Televisao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calculoImposto() {
        System.out.println("Calculando imposto do produto...");
        return preco * imposto;
    }
}
