package academy.devdojo.maratonajava.javacore.Oexcepition.runtime.test;

public class RunTimeTest02 {
    public static void main(String[] args) {
        divisao2(1,0);
    }

    private static int divisao(int a, int b){
        if (b == 0){
            throw new RuntimeException("dado invalido! não pode ser 0.");
        }
        return a/b;
    }

    private static int divisao2(int a, int b) {
        try{
            return a/b;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        return 0;
    }
}
