package effective.page2.item1;

public class Item1 {
    public static void main(String[] args) {
        var illitInstance = Illit.getMinjuInstance();

        System.out.println(illitInstance);
    }
}

class Illit implements IdolInterface {
    private String name;
    private Integer age;
    private Boolean isMinju;

    protected Illit(String name, Integer age, Boolean isMinju) {
        this.name = name;
        this.age = age;
        this.isMinju = isMinju;
    }

    private static final Illit MINJU = createMinju("Park Minju", 20);

    private Illit() {}

    private static final Illit ILLIT = new Illit();

    public static Illit getIllit() {
        return ILLIT;
    }

    public static Illit getInstance() {
        return MINJU;
    }

    public static Illit getMinjuInstance() {
        return Minju.getInstance();
    }

    public static Illit createIllit(String name, Integer age, Boolean isMinju) {
        return new Illit(name, age, isMinju);
    }

    public static Illit createMinju(String name, Integer age) {
        return createIllit(name, age, true);
    }

    @Override
    public String getName() {
        return "아일릿";
    }
}

class Minju extends Illit {
    private String caption;

    private Minju(String name, Integer age, String caption) {
        super(name, age, true);
        this.caption = caption;
    }

    private static final Minju MINJU = new Minju("민주", 20, "민주는 귀엽다.");

    public static Minju getInstance() {
        return MINJU;
    }
}

