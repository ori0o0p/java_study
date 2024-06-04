package effective.page2.item3;

public class SingletonWithPrivate {
    public static final SingletonWithPrivate INSTANCE = new SingletonWithPrivate();

    private SingletonWithPrivate() {}

    public void print() {
        System.out.println("아일릿 민주는 최고입니다.");
    }
}
