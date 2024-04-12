package academy.devdojo.maratonajava.javacore.Oexcepition.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Test01 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("fechando teste 1");
    }
}
