package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();

        searchPricesAsyncComplatableFuture(storeService);
    }


    private static void searchPricesAsyncComplatableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1" , "Store 2", "Store 3", "Store 4");

//        List<Double> collect = stores.stream().map(storeService::getPriceAsyncComplatableFuture).map(CompletableFuture::join).collect(Collectors.toList());       sicronicamente
        List<CompletableFuture<Double>> completableFuture = stores.stream().map(storeService::getPriceAsyncComplatableFuture)
                .collect(Collectors.toList());

        List<Double> prices = completableFuture.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.shutdown();
    }
}
