package stream;

import java.util.List;
import java.util.stream.Gatherers;

public class Gatherer {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<List<Integer>> windows = numbers.stream()
                .gather(Gatherers.windowFixed(2))
                .toList();

        System.out.println(windows);
    }

}
