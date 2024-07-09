package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r1 = () -> {
          synchronized (lock1){
              System.out.println("Thread 1: segurando lock1");
              System.out.println("Thread 1: esperando lock2");
          }
            synchronized (lock2){
              System.out.println("Thread 1: segurando lock2");

          }
        };

        Runnable r2 = () -> {
          synchronized (lock2){
              System.out.println("Thread 2: segurando lock2");
              System.out.println("Thread 2: esperando lock1");
          }
          synchronized (lock1){
              System.out.println("Thread 2: segurando lock1");

          }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
