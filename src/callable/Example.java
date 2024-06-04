package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example {

    public static void main(String[] args) throws Exception {
        Callable<String> callable = () -> "인생 ㅋㅋ";

        System.out.println(callable.call());

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callable);
        System.out.println(future.get());
        executorService.close();
    }
}
