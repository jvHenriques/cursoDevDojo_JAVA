package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario02;

public class FuncionarioTest02 {
    public static void main(String[] args) {

        Funcionario02 funcionario1 = new Funcionario02();
        double[] salariosInfo = {1430.88, 1430.88 , 1430.88};

        funcionario1.setNome1("pereirinha");
        funcionario1.setIdade(32);
        funcionario1.setSalario(salariosInfo);

        funcionario1.imprime();
        System.out.println(" ");
//        System.out.println("A média salarial do funcionario " + funcionario1.getNome1()+" é de: " +funcionario1.mediaSal());

    }

}
