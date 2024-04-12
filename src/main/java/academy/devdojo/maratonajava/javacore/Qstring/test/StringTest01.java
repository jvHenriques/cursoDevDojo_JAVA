package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Wlliam";
        String nome2 = "Wlliam";

        System.out.println(nome1.concat(" suanne"));
        System.out.println(nome1);

//        System.out.println(nome1.concat(nome2));

        nome1 = nome1.concat( " suanne");
        System.out.println(nome1);

        System.out.println(nome1 == nome2);

        String nome3 = new String( "Wlliam");
        System.out.println(nome2 == nome3.intern());
    }
}
