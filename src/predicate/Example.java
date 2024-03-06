package predicate;

import java.util.function.Predicate;

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

}
