package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("033920-92");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("toyota");
        pessoa.setCpf("123.132.442-43");

        pessoa.imprime();
    }
}
