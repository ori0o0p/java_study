package effective.page2.item3;

public class Main {
    public static void main(String[] args) {
        var single1 = SingletonWithPrivate.INSTANCE;
        var single2 = SingletonWithStaticFactory.getInstance();
        var single3 = SingletonWithEnum.INSTANCE;

        single1.print();
        single2.print();
        single3.print();
    }
}
