package academy.devdojo.maratonajava.javacore.Oexcepition.runtime.test;

import javax.annotation.processing.FilerException;
import java.sql.SQLException;

public class RunTimeTest04 {
    public static void main(String[] args) {

        //a excessão mais generica ficara por ultima, para que as mais especificas possam ser "usadas"
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("dentro de IllegalArgumentException");
        }catch (RuntimeException e){
            System.out.println("dentro de RuntimeException");
        }


        try {
            talvezLanceException();
        }catch (SQLException | FilerException e){
            e.printStackTrace();
        }
    }



    public static void talvezLanceException()throws SQLException, FilerException {

    }
}
