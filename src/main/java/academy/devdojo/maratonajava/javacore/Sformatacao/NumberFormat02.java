package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localItaly = Locale.ITALY;
        Locale localJapan = Locale.JAPAN;
        Locale localEUA = Locale.ENGLISH;

        NumberFormat[] n1 = new NumberFormat[4];
        n1[0] = NumberFormat.getCurrencyInstance(localEUA);
        n1[1] = NumberFormat.getCurrencyInstance(localJapan);
        n1[2] = NumberFormat.getCurrencyInstance(localeBR);
        n1[3] = NumberFormat.getCurrencyInstance(localItaly);

        double valor = 100_000_000_2130D;
        for (NumberFormat numberFormat : n1) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
