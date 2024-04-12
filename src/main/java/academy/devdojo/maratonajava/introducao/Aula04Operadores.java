package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        double res = numero1 / (double) numero2;

        System.out.println("o resultato é " + res);

        int resto =20 % 2;
        System.out.println("o resto da divisão é " + resto);

        //operadores comparativos = < > <= >= !=
        boolean is10maiorque20 = 10>20;
        boolean is10menorque20 = 10<20;
        boolean is10igual20 = 10==20;
        boolean is10igual10 = 10==10;

        System.out.println("10 maior que 20 = " + is10maiorque20);
        System.out.println("10 menor que 20 = " + is10menorque20);
        System.out.println("10 igual 20 = " + is10igual20);
        System.out.println("10 igual 10 = " + is10igual10);

        //operadores logicos = && (AND) ------     || (OR)
        int idade = 35;
        float salario = 3500F;
        Boolean isDentroDaLeiMaiorQueTrinta =  idade > 30 && salario >= 4612;

    }
}
