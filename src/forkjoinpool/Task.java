package forkjoinpool;

import java.util.concurrent.RecursiveTask;

public class Task extends RecursiveTask<Long> {
    private final long[] numbers;
    private int start;
    private int end;

    public Task(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;

        if (length <= 100) {
            long sum = 0;

            for (int i = start; i < end; i++) {
                sum += numbers[i];
            }
            return sum;
        }
        int middle = start + length / 2;
        Task leftTask = new Task(numbers, start, middle);
        Task rightTask = new Task(numbers, middle, end);

        leftTask.fork();
        Long rightResult = rightTask.compute();
        Long leftResult = leftTask.join();

        return leftResult + rightResult;
    }

}
