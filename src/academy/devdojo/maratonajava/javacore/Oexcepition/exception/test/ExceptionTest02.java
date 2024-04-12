package academy.devdojo.maratonajava.javacore.Oexcepition.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{

        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {     //throws IOException        //atribuo a responsabilidade de fazer o tratamento para quem ta chamando o metodo
        File file = new File("arquivo\\teste.txt");
        try {                                                                              //tente fazer isso
            boolean isCreated = file.createNewFile();
            System.out.println("arquivo for criado: " +isCreated);
        }catch (IOException e){                                                           //se der erro esta avisado que eu estou preparado para essa excessão
            e.printStackTrace();                                        //imprimindo dados da exceção
            throw  e;
        }
    }

//    public static void criarNovoArquivo() {     //throws IOException        //atribuo a responsabilidade de fazer o tratamento para quem ta chamando o metodo
//        File file = new File("arquivo\\teste.txt");
//        try {                                                                              //tente fazer isso
//            boolean isCreated = file.createNewFile();
//            System.out.println("arquivo for criado: " +isCreated);
//        }catch (IOException e){                                                           //se der erro esta avisado que eu estou preparado para essa excessão
//            e.printStackTrace();//imprimindo dados da exceção
//            throw new RuntimeException("problema ao criar o arquivo");
//        }
//    }
}
