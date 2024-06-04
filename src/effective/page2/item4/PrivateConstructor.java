package effective.page2.item4;

public class PrivateConstructor {
    private PrivateConstructor() {
        throw new AssertionError();
    }

    public static void print() {
        System.out.println("아일릿 민주는 최고예요.");
    }
}
