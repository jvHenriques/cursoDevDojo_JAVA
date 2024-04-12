package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario02 {
    private String nome1;
    private int idade;
    private double [] salario;

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome1() {
        return nome1;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void imprime(){
        System.out.println(this.nome1);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
            for (int i = 0; i < salario.length; i++) {
                System.out.println(salario[i]);
            }

        mediaSal();
    }

    public void mediaSal(){

        if (salario == null) {
            return;
        }
        double mediaFinal = 0;
        double mediaParcial = 0;
            for (int i = 0; i < salario.length; i++) {
                mediaParcial = mediaParcial + salario[i];
                mediaFinal = mediaParcial / 3;
            }
        System.out.println("A média final é: "+ mediaFinal);
    }
}
