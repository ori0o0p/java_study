package completablefuture;

import java.util.concurrent.CompletableFuture;

public class Example {

    public static void main(String[] args) {
        anyOf();
    }

    public static void integerFuture() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10)
                .thenApplyAsync(number -> number * 3)
                .thenApplyAsync(number -> number + 3);

        future.thenAccept(System.out::println); // 33
    }

    public static void allOf() {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Result1");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Result2");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Result3");

        CompletableFuture.allOf(future1, future2, future3)
                .thenRun(() -> {
                    String result1 = future1.join();
                    String result2 = future2.join();
                    String result3 = future3.join();

                    System.out.println(result1 + " " + result2 + " " + result3);
                });
    }

    public static void anyOf() {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                return "Result1";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Result2");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Result3");

        CompletableFuture.anyOf(future1, future2, future3)
                .thenAccept(System.out::println);
    }

    public static void exception() {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException();
        });
        future1.exceptionally(exception -> {
            System.out.println(exception.getMessage());
            return "Result";
        }).thenAccept(System.out::println);
    }

}
