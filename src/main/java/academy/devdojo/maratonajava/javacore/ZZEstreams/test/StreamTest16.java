package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        Long num = 10_000_000L;

        sumFor(num);
        System.out.println();

        sumStreamIterate(num);
        System.out.println();

        sumPararelStreamIterate(num);
        System.out.println();

        sumLongStreamIterate(num);
        System.out.println();

        sumParalelLongStreamIterate(num);
    }

    private static void sumFor(Long num){
        System.out.println("Sum for");

        long result = 0;
        long init = System.currentTimeMillis();

        for (int i = 1; i < num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();

        System.out.println(result + " "+ (end - init)  +"m/s");
    }

    private static void sumStreamIterate(Long num){
        System.out.println("Sum streamIterate");

        long init = System.currentTimeMillis();

        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " "+ (end - init)  +"m/s");
    }
//  [1,2,3,4,5,6,7,8,9,0]
//  1 -> 1-5
//  2 -> 6-0
    private static void sumPararelStreamIterate(Long num){
        System.out.println("Sum Paralel streamInterate");

        long init = System.currentTimeMillis();

        Long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " "+ (end - init)  +"m/s");
    }

    private static void sumLongStreamIterate(Long num){
        System.out.println("Sum Long streamInterate");

        long init = System.currentTimeMillis();

        Long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " "+ (end - init)  +"m/s");
    }

    private static void sumParalelLongStreamIterate(Long num){
        System.out.println("Sum PararelLong streamInterate");

        long init = System.currentTimeMillis();

        Long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " "+ (end - init)  +"m/s");
    }
}
