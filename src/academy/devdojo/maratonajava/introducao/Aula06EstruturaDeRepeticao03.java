package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {

        int valMax = 50;

        for (int i = 0; i <= valMax; i++) {
            if (i > 25) {break;};
                System.out.println("os numeros pedidos =" + i);
        }
    }
}
