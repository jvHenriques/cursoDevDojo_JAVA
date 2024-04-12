package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.domain.Quote;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
//        searchstorePricesWithDiscount(service);
        searchstorePricesWithDiscountAsync(service);
    }

    private static void searchstorePricesWithDiscount(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        stores.forEach(s  -> System.out.println(service.getPriceSycron(s)));

        stores.stream()
                .map(service::getPriceSycron)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchstorePricesWithDiscountAsync(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        stores.forEach(s  -> System.out.println(service.getPriceSycron(s)));

        List<CompletableFuture<String>> completableFutures = stores.stream()
                // getting the price async storeName:price:discountCode
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSycron(s)))
                // instantiating a new Quote from the string generated by getPriceAsync
                .map(cf -> cf.thenApply(Quote::newQuote))
                // composing the first completable future
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .collect(Collectors.toList());

        completableFutures.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }
}
