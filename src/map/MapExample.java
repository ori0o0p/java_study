package map;

import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = Map.of(
            "one", 1,
            "two", 2,
            "three", 3,
            "four", 4);
        //        "", null);  null을 허용하지 않음

        stringIntegerMap.forEach((key, value) -> System.out.println(key + " : " + value));

        // map은 순서가 없음
        //three : 3
        //four : 4
        //two : 2
        //one : 1

        // stringIntegerMap.put("five", 5); Immutable 컬렉션이므로 데이터를 추가할 수 없읍ㄴ
    }

}
