package trycatch;

public class Example {

    public static void main(String[] args) {
        example2();
    }

    public static void example1() {
        try {
            System.out.println("try 블록 실행");
            System.out.println(45 / 0);
        }
        catch(ArithmeticException e) {
            System.out.println("ArithmeticException: catch 블록 실행");
        }
        finally {
            System.out.println("finally 블록 실행");
        }
    }

    public static void example2() {
        try {
            System.out.println("try 블록 실행");
        }
        catch(ArithmeticException e) {
            System.out.println("ArithmeticException: catch 블록 실행");
        }
        finally {
            System.out.println("finally 블록 실행");
            System.out.println(45 / 0); // finally 블록에서 예외
        }
        System.out.println("끝"); // 수행 안됌
    }


}
