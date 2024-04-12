package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William";
        nome.substring(1,4);


        StringBuilder sb = new StringBuilder("William ");
        sb.append("Devdojo ");sb.append("maratona");

        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
