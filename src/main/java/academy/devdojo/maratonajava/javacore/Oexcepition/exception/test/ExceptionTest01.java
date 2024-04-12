package academy.devdojo.maratonajava.javacore.Oexcepition.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {                                                                              //tente fazer isso
            boolean isCreated = file.createNewFile();
            System.out.println("arquivo for criado: " +isCreated);
        }catch (IOException e){                                                           //se der erro esta avisado que eu estou preparado para essa excessão
            e.printStackTrace();                                                         //imprimindo dados da exceção
        }
    }
}
