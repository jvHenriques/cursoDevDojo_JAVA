package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario1;
    private double salario2;
    private double salario3;

    public Funcionario(String nome, int idade , double salario1, double salario2, double salario3){
        this();
        this.nome = nome;
        this.idade = idade;
        this.salario1 = salario1;
        this.salario2 = salario2;
        this.salario3 = salario3;
    }

    public Funcionario(){

    }

    public void setNome(String nome){
       this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalario1(double salario1){
        this.salario1 = salario1;
    }

    public void setSalario2(double salario2){
        this.salario2 = salario2;
    }

    public void setSalario3(double salario3){
        this.salario3 = salario3;
    }


    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario1(){
        return salario1;
    }

    public double getSalario2(){
        return salario2;
    }

    public double getSalario3(){
        return salario3;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario1);
        System.out.println(this.salario2);
        System.out.println(this.salario3);
    }

    public double mediaSal(double a, double b, double c){

        double media =  (a + b + c)/3;
        return media;
    }
}
