package map;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put("one", 1);
        stringIntegerMap.put("two", 2);
        stringIntegerMap.put("three", 3);
        stringIntegerMap.put("four", 4);
        stringIntegerMap.put(null, null); // hashmap은 null을 허용

        stringIntegerMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }

}
