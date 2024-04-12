package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public  void subtraiDoisNumeros(){
        System.out.println(21-2);
    }
    public void multiplicaDoisNumeros(int n1,int n2){
        System.out.println(n1*n2);

    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2==0){
            return 0;
        }
        return  num1/num2;
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if (num2==0){
            System.out.println("não existe divisão para 0");
        }else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 "+ numero1);
        System.out.println("num2 "+ numero2);
    }

    public void arraySoma(int[] a){
        int soma = 0;

        for (int i = 0; i < a.length; i++) {
            soma += a[i];
        }
        System.out.println(soma);

    }
}
