package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {
                                                       //imprimir numeros pares de um intervalo de 0 ate 100
        int i = 0;

            for(i=0;i<=100;i=i+2) {
                System.out.println("numero:" + i);
        }

                                                      //outro jeito=
        i=0;
         for( i=0;i<=100;i=i+2) {
             if (i % 2 == 0) {
                 System.out.println("números par= " + i);
             }
         }
    }
}
