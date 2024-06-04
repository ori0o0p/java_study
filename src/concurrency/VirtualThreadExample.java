package concurrency;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadExample {

    public static void main(String[] args) {
        vt_2();
    }

    private static void vt_2() {
        long start = System.currentTimeMillis();

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(2));
                    return null;
                });
            });
        }

        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }

    private static void vt_1() throws InterruptedException {
        Thread vt = Thread.ofVirtual()
                .name("vt seungwon ;", 1)
                .start(VirtualThreadExample::task);

        vt.join();
    }

    private static void task() {
        System.out.println("thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

}
