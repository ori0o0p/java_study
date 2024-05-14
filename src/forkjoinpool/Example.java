package forkjoinpool;

import java.util.concurrent.ForkJoinPool;

public class Example {
    public static void main(String[] args) {
        long[] numbers = new long[1_000_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        ForkJoinPool pool = new ForkJoinPool(10);
        Task task = new Task(numbers, 0, numbers.length);
        long result = pool.invoke(task);
        System.out.println("Sum: " + result);

        pool.shutdown();
    }

}
