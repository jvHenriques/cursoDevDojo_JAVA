package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSycron(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPriceAsyncFuture(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return ex.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPriceAsyncComplatableFuture(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    public static void shutdown(){
        ex.shutdown();
    }

    private double priceGenerator() {
        System.out.printf("%s generating price%n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
