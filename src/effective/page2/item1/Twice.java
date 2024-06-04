package effective.page2.item1;

public class Twice implements IdolInterface {

    private static final Twice TWICE = new Twice();

    public static Twice getInstance() {
        return TWICE;
    }

    @Override
    public String getName() {
        return "트와이스";
    }
}
