package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();

    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
        }
        if (account.getBalance() < 0) {
            System.out.println("###FERROU###");
        }
    }

//    public synchronized void withdrawal(int amount) {
    public  void withdrawal(int amount) {
        System.out.println(getNameThread() + " ####Está FORA do synchronizer");
        synchronized (account) {
            System.out.println(getNameThread() + " *****Está DENTRO do synchronizer");
            if (account.getBalance() >= amount) {
                System.out.println(getNameThread() + " está indo sacar o dinheiro");
                account.withdrawal(amount);
                System.out.println(getNameThread() + " Completou o saque! Saldo atual da conta: " + account.getBalance());
            } else {
                System.out.println("sem dinheiro para " + getNameThread() + " realizar operação " + account.getBalance());
            }
        }
    }

    private static String getNameThread() {
        return Thread.currentThread().getName();
    }


}
