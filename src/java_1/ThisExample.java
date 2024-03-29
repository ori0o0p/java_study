package java_1;

public class ThisExample {

    public static void main(String[] args) {
        Person person = new Person("김승원", 18, true);
        Person person2 = new Person("바보", 20); // false
        Person person3 = new Person("멍청이"); // 0, false

        System.out.println(person);
        System.out.println(person2);
        System.out.println(person3);
    }

}

record Person(String name, int age, boolean isStupid) { // 기본 생성자 파라미터 3개
//    public Person(String name, int age, boolean isStupid) { // 기본 생성자
//        this.name = name; // 자신의 객체에 접근하는 this
//        this.age = age;
//        this.isStupid = isStupid;
//    }

    public Person(String name, int age) { // 파라미터 2개
        this(name, age, false); // 기본 생성자에 접근하는 this()
    }

    public Person(String name) { // 파라미터 1개
        this(name, 0); // 파라미터 2개를 받는 생성자에 접근
    }

}
