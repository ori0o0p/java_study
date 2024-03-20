package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class NullableStream {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("usada", null, "pekroa", null, null, "hololive");

        System.out.println(":filter---------");
        filter(list);

        System.out.println("\n\n\nflatmap ----------");
        flatmap(list);
    }

    private static void filter(List<String> list) {
        System.out.println("non null list -----");
        list.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);

        System.out.println("null list -----");
        list.stream()
                .filter(Objects::isNull)
                .forEach(System.out::println);

        System.out.println("all list -----");
        list.forEach(System.out::println);
    }

    private static void flatmap (List<String> list) {
        System.out.println("non null list -----");
        list.stream()
                .flatMap(Stream::ofNullable)
                .forEach(System.out::println);

        System.out.println("null list -----");
        list.stream()
                .flatMap(s -> s != null ? Stream.of(s) : Stream.empty())
                .forEach(System.out::println);

        System.out.println("all list -----");
        list.forEach(System.out::println);
    }

}
