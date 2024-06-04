package runnable;

public class Example {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("하하 인생!");
        runnable.run();

        Thread thread = new Thread(runnable);
        thread.start();
    }

}
