package effective.page2.item5;

import java.util.function.Supplier;

public class DependencyInject {
    private final IllitInterface illitInterface;

    public DependencyInject(Supplier<? extends IllitInterface> illitInterface) {
        this.illitInterface = illitInterface.get();
    }

    public void print() {
        illitInterface.print();
    }
}

class Main {
    public static void main(String[] args) {
        var di = new DependencyInject(IllitInterface::new);

        di.print();
    }
}
