package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        Predicate<String> predicate = (String s) -> s.startsWith("A");

        System.out.println("ABC : " + predicate.test("ABC"));
        System.out.println("BBC : " + predicate.test("BBC"));
        System.out.println("AAA : " + predicate.test("AAA"));

//     출력 :
//        ABC : true
//        BBC : false
//        AAA : true
    }

    private static void list() {
        List<Integer> numbers = List.of(1, 12, 5, 18, 9, 21);

        Predicate<Integer> isGreaterThan10 = (Integer number) -> number > 10;

        List<Integer> filteredNumbers = numbers.stream()
                .filter(isGreaterThan10)
                .toList();

        System.out.println(filteredNumbers);

    }

}
