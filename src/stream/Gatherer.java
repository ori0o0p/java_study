package stream;

import java.util.List;
import java.util.stream.Gatherers;

public class Gatherer {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        scan(numbers);
    }

    public static void fixed(List<Integer> numbers) {
        List<List<Integer>> windows = numbers.stream()
                .gather(Gatherers.windowFixed(2))
                .toList();

        System.out.println(windows);
    }

    public static void sliding(List<Integer> numbers) {
        List<List<Integer>> windows = numbers.stream()
                .gather(Gatherers.windowSliding(2))
                .toList();

        System.out.println(windows);
    }

    public static void fold(List<Integer> numbers) {
        List<String> list = numbers.stream()
                .gather(Gatherers.fold(() -> "", (string, number) -> string + number))
                .toList();

        System.out.println(list);
    }

    public static void mapConcurrent(List<Integer> numbers) {
        List<Integer> list = numbers.stream()
                .gather(Gatherers.mapConcurrent(1, number -> number * number))
                .toList();

        System.out.println(list);
    }

    public static void scan(List<Integer> numbers) {
        List<Integer> list = numbers.stream()
                .gather(Gatherers.scan(() -> 4, Integer::sum))
                .toList();

        System.out.println(list);
    }

}
