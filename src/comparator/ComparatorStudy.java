package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorStudy {

    public static void main(String[] args) {
        List<Kim> kims = new ArrayList<>();

        kims.add(new Kim("김승원", 18, 55));
        kims.add(new Kim("김숭원", 20, 60));
        kims.add(new Kim("원승김", 18, 100));
        kims.add(new Kim("바보", 18, 55));

        kims.sort(Comparator.comparing(Kim::age) // 나이순
                .reversed() // 역정렬
                .thenComparing(Kim::weight) // 나이가 같으면 무게로 정렬
                .thenComparing(Kim::name)); // 무게도 같으면 이름으로 정렬

        kims.forEach(System.out::println);
    }

}

record Kim(String name, Integer age, Integer weight) {}
