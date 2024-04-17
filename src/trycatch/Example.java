package trycatch;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {

    public static void main(String[] args) {
        example4();
    }

    public static void example1() {
        try {
            System.out.println("try 블록 실행");
            System.out.println(45 / 0);
        }
        catch(ArithmeticException e) {
            System.out.println("ArithmeticException: catch 블록 실행");
        }
        finally {
            System.out.println("finally 블록 실행");
        }
    }

    public static void example2() {
        try {
            System.out.println("try 블록 실행");
        }
        catch(ArithmeticException e) {
        }
        finally {
            System.out.println("finally 블록 실행");
            System.out.println(45 / 0); // finally 블록에서 예외
        }
        System.out.println("끝"); // 수행 안됌
    }

    public static void example3() {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> System.out.println(45 / 0));

        try {
            future.get();
        }
        catch(ArithmeticException | InterruptedException | ExecutionException e) {
            System.out.println("ArithmeticException: catch 블록 실행");
        }
    }

    public static void example4() {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> System.out.println(45 / 0))
                .exceptionally(e -> {
                    if (e.getCause() instanceof ArithmeticException) {
                        System.out.println("ArithmeticException: catch 블록 실행");
                    }
                    return null;
                });

        try {
            future.get();
        }
        catch (ExecutionException | InterruptedException e) {
            System.out.println("ExecutionException | InterruptedException 실행");
        }
    }

}
