package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncComplatableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.printf(String.valueOf(storeService.getPriceSycron("Store 1")));
        System.out.printf(String.valueOf(storeService.getPriceSycron("Store 2")));
        System.out.printf(String.valueOf(storeService.getPriceSycron("Store 3")));
        System.out.printf(String.valueOf(storeService.getPriceSycron("Store 4")));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPricesAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        Future<Double> priceAsyncFuture1 = storeService.getPriceAsyncFuture("Store 1");
        Future<Double> priceAsyncFuture2 = storeService.getPriceAsyncFuture("Store 2");
        Future<Double> priceAsyncFuture3 = storeService.getPriceAsyncFuture("Store 3");
        Future<Double> priceAsyncFuture4 = storeService.getPriceAsyncFuture("Store 4");

        try {
            System.out.println(priceAsyncFuture1.get());
            System.out.println(priceAsyncFuture2.get());
            System.out.println(priceAsyncFuture3.get());
            System.out.println(priceAsyncFuture4.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncComplatableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        CompletableFuture<Double> priceAsyncFuture1 = storeService.getPriceAsyncComplatableFuture("Store 1");
        CompletableFuture<Double> priceAsyncFuture2 = storeService.getPriceAsyncComplatableFuture("Store 2");
        CompletableFuture<Double> priceAsyncFuture3 = storeService.getPriceAsyncComplatableFuture("Store 3");
        CompletableFuture<Double> priceAsyncFuture4 = storeService.getPriceAsyncComplatableFuture("Store 4");

        System.out.println(priceAsyncFuture1.join());
        System.out.println(priceAsyncFuture2.join());
        System.out.println(priceAsyncFuture3.join());
        System.out.println(priceAsyncFuture4.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.shutdown();
    }
}
