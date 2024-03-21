package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StreamExample {

    public static void main(String[] args) {
        List<Person> person = List.of(
                new Person("김승원", 18, true),
                new Person("바보", 20, true),
                new Person("멍청이", 13, false),
                new Person("대마고", 21, false),
                new Person("이상함", 12, true),
                new Person("나쁜", 10, false),
                new Person("똥", 50, true),
                new Person("승원김", 48, false)
        );

        List<Integer> ages = person.stream()
                .filter(p -> p.age() >= 20)
                .sorted(Comparator.comparingInt(Person::age))
                .map(Person::age)
                .toList();

        List<Map<String, Boolean>> result = person.stream()
                .map(p -> Map.of(p.name(), p.isStupid()))
                .toList();

        List<Person> seungWonList = person.stream()
                .filter(p -> p.name().contains("승원"))
                .toList();

        Optional<Person> maxAge = person.stream()
                .max(Comparator.comparingInt(Person::age));
        

    }

}

record Person(String name, int age, boolean isStupid) {}
