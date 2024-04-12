package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome1 = "              Luffy";
        String numeros = "012345";

        System.out.println(nome1.charAt(0));
        System.out.println(nome1.length());
        System.out.println(nome1.replace("f","l"));
        System.out.println(nome1.toLowerCase());
        System.out.println(nome1.toUpperCase());

        System.out.println(numeros.substring(3));
        System.out.println(nome1.trim());


    }
}
