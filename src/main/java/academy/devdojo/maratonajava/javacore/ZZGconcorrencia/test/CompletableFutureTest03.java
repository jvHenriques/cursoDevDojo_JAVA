package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceDeprecate;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;


public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecate storeServiceDeprecate = new StoreServiceDeprecate();

        searchPricesAsyncComplatableFuture(storeServiceDeprecate);
    }


    private static void searchPricesAsyncComplatableFuture(StoreServiceDeprecate storeServiceDeprecate){
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<String> stores = List.of("Store 1" , "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFuture = stores.stream()
                        .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecate.getPriceSycron(s),executor))
                .collect(Collectors.toList());

        List<Double> prices = completableFuture.stream().map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.shutdown();
    }
}
