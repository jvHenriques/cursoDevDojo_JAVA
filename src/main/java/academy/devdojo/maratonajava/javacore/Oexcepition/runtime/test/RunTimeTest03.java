package academy.devdojo.maratonajava.javacore.Oexcepition.runtime.test;

public class RunTimeTest03 {
    public static void main(String[] args) {
        conexao();
    }




    //finally sempre é executado independente de excessoes ou retorno.
    private static String conexao() {
        try {
            System.out.println("abrindo arquivo. ");
            System.out.println("escrevendo no arquivo. ");
//            throw new RuntimeException();
//            System.out.println("fechando aquivo. ");
            return "Conexão aberta";
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechando aquivo. ");
        }
        return "";
    }



        private static String conexao2(){
        try {
            System.out.println("abrindo arquivo. ");
            System.out.println("escrevendo no arquivo. ");
//            throw new RuntimeException();
//            System.out.println("fechando aquivo. ");
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            System.out.println("fechando aquivo. ");
        }
            return null;
        }
}
