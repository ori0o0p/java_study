package effective.page2.item1;

public interface IdolInterface {
    String getName();

    static IdolInterface of(String name) {
        if (name.equals("illit")) {
            return Illit.getIllit();
        }
        return Twice.getInstance();
    }
}
