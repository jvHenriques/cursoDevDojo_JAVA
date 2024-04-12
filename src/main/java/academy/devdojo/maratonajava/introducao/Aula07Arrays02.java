package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        int[] idades= new int[3];

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Gohan";             //criei um array nome com os valores
        nomes[2] = "Vegeta";


        for (int i = 0; i < 3; i++) {         //comando for para percorrer o array
            System.out.println("Vetor na posição " + i + "é" + nomes[i]);

        }
    }
}