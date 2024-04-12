package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.add("C");
        stringQueue.add("A");
        stringQueue.add("B");

        System.out.println(stringQueue);

        while (!stringQueue.isEmpty()){
            System.out.println(stringQueue.poll());
        }
    }
}
