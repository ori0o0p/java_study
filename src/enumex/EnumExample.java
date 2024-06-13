package enumex;

public enum EnumExample {
    KIM {
        @Override
        public void print() {
            System.out.println("김대운은 천재");
        }
    },
    DAE_WOON {
        @Override
        public void print() {
            System.out.println("김대운은 바보");
        }
    };

    public abstract void print();
}

class Main {
    public static void main(String[] args) {
        EnumExample.KIM.print();
    }
}
