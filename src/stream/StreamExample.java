package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {

    static List<Person> person = List.of(
            new Person("김승원", 18, true),
            new Person("바보", 20, true),
            new Person("멍청이", 13, false),
            new Person("대마고", 21, false),
            new Person("이상함", 12, true),
            new Person("나쁜", 10, false),
            new Person("똥", 50, true),
            new Person("승원김", 48, false)
    );

    public static void main(String[] args) {
        var response = getPersonMapGroupByStupid();

        System.out.println(response);
    }

    public static Map<Boolean, Optional<Person>> getPersonMapGroupByStupidMaxAge() {
        return person.stream()
                .collect(Collectors.groupingBy(
                        Person::isStupid,
                        Collectors.maxBy(
                                Comparator.comparingInt(Person::age)
                        ))
                );
    }

    public static Map<Boolean, List<Person>> getPersonMapGroupByStupid() {
        var stupid = person.stream()
                .filter(Person::isStupid)
                .toList();

        var notStupid = person.stream()
                .filter(p -> !p.isStupid())
                .toList();

        return null;
    }

    public List<Integer> getFilteredPersonAndSortedByAge() {
        return person.stream()
                .filter(p -> p.age() >= 20)
                .sorted(Comparator.comparingInt(Person::age))
                .map(Person::age)
                .toList();
    }

    public List<Map<String, Boolean>> getPersonMap() {
        return person.stream()
                .map(p -> Map.of(p.name(), p.isStupid()))
                .toList();
    }

    public List<Person> getPersonList() {
        return person.stream()
                .filter(p -> p.name().contains("승원"))
                .toList();
    }

    public Optional<Person> getMaxAgePerson() {
        return person.stream()
                .max(Comparator.comparingInt(Person::age));
    }

    public static void print(List<?> list) {
        list.forEach(System.out::println);
    }

    public record Person(String name, int age, boolean isStupid) {}

}

