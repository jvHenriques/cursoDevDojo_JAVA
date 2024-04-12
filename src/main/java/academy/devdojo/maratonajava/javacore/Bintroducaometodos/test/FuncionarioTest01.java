package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionarioTest = new Funcionario("AlfredoTest", 32,1465.98, 1465.98, 1465.98);
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("ALfredo Lima");
        funcionario.setIdade(32);
        funcionario.setSalario1(1465.98);
        funcionario.setSalario2(2300.99);
        funcionario.setSalario3(890.00);

        funcionario.imprime();
        System.out.println(" ");
        System.out.println("A média salarial do funcionario " + funcionario.getNome()+" é de: " +funcionario.mediaSal(funcionario.getSalario1(), funcionario.getSalario2(), funcionario.getSalario3()));


    }
}
