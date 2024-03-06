package type;

public class ObjectType {

    public static void main(String[] args) {
        Object x = () -> System.out.println("김승원");
        /*
            위의 코드에서는 Object가 함수형 인터페이스가 아니여서 람다의 대상이 될 수 없어 올바르지 않다.

            코드를 올바르게 고치려면 람다의 대상 형식을 명시하여 Runnable로 캐스팅하여 해결할 수 있다.
        */
        Object o = (Runnable) () -> System.out.println("김승원");
        // or
        Runnable runnable = () -> System.out.println("김승원");
    }

}
