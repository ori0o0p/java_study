package forkjoinpool;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(8);

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list = list.parallelStream()
                .map(element -> element + 10)
                .toList();

        list.forEach(System.out::println);
    }

}
