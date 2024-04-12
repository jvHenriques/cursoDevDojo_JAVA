package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {

        double valorCarro = 30000;



        for (int parcela = 1; parcela < valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000)
            {
                System.out.println("parcela " + parcela + " no valor de R$" + valorParcela);
            }else {break;}
        }
    }
}
