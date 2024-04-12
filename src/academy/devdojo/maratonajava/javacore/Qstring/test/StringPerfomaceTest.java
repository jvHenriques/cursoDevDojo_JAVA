package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerfomaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(200);
        long fim = System.currentTimeMillis();
        System.out.println("tempo gasto para String :" + (fim - inicio) + "ms");

        System.out.println("__________________");
        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para StringBuilder :" + (fim - inicio) + "ms");


        System.out.println("__________________");
        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para StringBuffer :" + (fim - inicio) + "ms");
    }

    public static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
