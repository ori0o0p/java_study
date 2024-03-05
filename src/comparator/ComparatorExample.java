package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("바보", 111));
        userList.add(new User("똥", 333));
        userList.add(new User("멍청이", 222));

        userList.sort((u1, u2) -> u1.age().compareTo(u2.age()));
        //userList.sort(Comparator.comparing(User::age));

        userList.forEach(System.out::println);
//     출력 :
//        User[name=바보, age=111]
//        User[name=멍청이, age=222]
//        User[name=똥, age=333]
    }

}

record User(String name, Integer age) {}
