package effective.page2.item3;

public class SingletonWithStaticFactory {
    private static final SingletonWithStaticFactory INSTANCE = new SingletonWithStaticFactory();

    private SingletonWithStaticFactory() {}

    public static SingletonWithStaticFactory getInstance() {
        return INSTANCE;
    }

    public void print() {
        System.out.println("아일릿 민주는 최고입니다.");
    }
}
