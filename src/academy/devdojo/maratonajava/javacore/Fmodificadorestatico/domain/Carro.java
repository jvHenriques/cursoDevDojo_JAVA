package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("nome: " + this.nome);
        System.out.println("velocidade maxima: " + this.velocidadeLimite);
        System.out.println("velocidade atual: " + this.velocidadeMaxima);
    }


    public static void setVelocidadeLimite(double velocidadeLimite){Carro.velocidadeLimite=velocidadeLimite;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeAtual(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite(){return velocidadeLimite;}

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

}
