package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

    public static void main(String[] args) {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                .toList();

        list.add(5912_0391); // Exception !!
        /*
            Stream.toList()는 unmodifiableList를 반환하는데 이 리스트는 변경이 불가능한 리스트이다.
            그래서 add, remove 등 리스트를 변경하는 것이 불가능하다.

            list를 변경하고 싶으면 아래의 코드처럼 작성해야한다.
            Stream.toList() -> Stream.collect(Collectors.toList())
        */


        List<Integer> list2 = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());

        list2.add(5912_0391);

        System.out.println(list2);
    }

}
