package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {
    static List<Integer> list;

    public static void main(String[] args) {
        listInit();

        long start = System.currentTimeMillis();
        list = list.parallelStream()
                .peek(element -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                }).toList();

        long end = System.currentTimeMillis();

        System.out.println((end - start) + "ms");
    }

    private static void listInit() {
        list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }

}
