package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //formas de ter os valores nos arrays
        int[] num = new int[3];                                         //indiretamente
        num[0] = 2;
        num[1] = 3;
        num[2] = 1;

        int [] num2 = new int[]{1,2,3,4,5};                             //pelos 2 "métodos"


        int [] num3 = {1,2,3,4,5};                                      //diretamente

        for (int i = 0; i < num3.length; i++) {
            System.out.println("numeros: " + num3[i]);

        }
        System.out.println("");
        for (int i:num2){
            System.out.println("comando foreach " + i);
        }

    }
}
