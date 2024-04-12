package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        //while / do while / for
        byte count = 0;
            while (count < 10)             //comando while
        {
            System.out.println("faça algo");
            count += 1;
        }
        System.out.println("do while");  //realiza o código ao menos uma vez, independente da condição
            do{
                System.out.println("faça algo");
            }while (count ==1);

            byte i = 0;
               for(i=0+1; i<=10; i++)        //comando for, muito utilizado para index
                  System.out.println("Comando For:" +i);
    }
}
