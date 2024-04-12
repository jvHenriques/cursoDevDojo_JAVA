package academy.devdojo.maratonajava.javacore.Oexcepition.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcepition.exception.domain.Test01;
import academy.devdojo.maratonajava.javacore.Oexcepition.exception.domain.Test02;

import java.io.*;

public class TryWithResoursesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try(Test01 test01 = new Test01();
            Test02 test02 = new Test02();) {

        }catch (IOException e){
            e.printStackTrace();
        }
    }



    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
