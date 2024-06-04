package effective.page2.item5;

public class SelfInject {
    private static final IllitInterface illitInterface = new IllitInterface();

    public static void main(String[] args) {
        illitInterface.print();
    }
}
