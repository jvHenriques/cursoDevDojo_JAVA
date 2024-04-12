package academy.devdojo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretory = new File("pasta");
        boolean isCriatedDiretory = fileDiretory.mkdir();
        System.out.println(isCriatedDiretory);

        File fileArquivoDiretorio = new File(fileDiretory, "exemplo.txt");

        boolean isCreatedNewFileinDirectory = fileArquivoDiretorio.createNewFile();
        System.out.println(isCreatedNewFileinDirectory);

        File renamedFile = new File(fileDiretory,"exemplo_renomeado_txt");
        boolean isRenomedFile = fileArquivoDiretorio.renameTo(renamedFile);
        System.out.println(isRenomedFile);

        File renameDiretory = new File("past_renomed");
        boolean isRenamedDiretory = fileDiretory.renameTo(renameDiretory);
        System.out.println(isRenamedDiretory);


    }
}
