package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable{
    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s inicio %d%n", Thread.currentThread().getName(),num );
        try {
            TimeUnit.SECONDS.sleep(1);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("a %s finalizou%n", Thread.currentThread().getName());
    }
}
public class ExecutorsTest01 {
    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.execute(new Printer(5));
        executorService.execute(new Printer(6));
        while (!executorService.isTerminated()){}
        System.out.println("programa finalizado");
    }
}
