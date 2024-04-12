package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula05Switch {
    public static void main(String[] args) {
        byte dia = 3;
        switch (dia){
            case(1):
                System.out.println("Final de semana");
                break;
            case(2):
                System.out.println("Dia útil");
                break;
            case(3):
                System.out.println("Dia útil");
                break;
            case(4):
                System.out.println("Dia útil");
                break;
            case(5):
                System.out.println("Dia útil");
                break;
            case(6):
                System.out.println("Dia útil");
                break;
            case(7):
                System.out.println("Final de semana");
            default:
                System.out.println("opção inválida");
        }

    }
}
