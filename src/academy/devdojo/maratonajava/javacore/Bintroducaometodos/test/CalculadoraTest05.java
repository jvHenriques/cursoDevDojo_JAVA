package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] somas = new int[5];
        somas[0] = 2;
        somas[1] = 2;
        somas[2] = 2;
        somas[3] = 2;
        somas[4] = 2;


        calculadora.arraySoma(somas);
    }
}
