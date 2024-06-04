package effective.page2.item1;

public class Main {
    public static void main(String[] args) {
        IdolInterface idol = IdolInterface.of("illit");

        System.out.println(idol.getName());
    }
}
