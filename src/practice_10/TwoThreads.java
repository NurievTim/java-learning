package practice_10;

public class TwoThreads {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = () -> {
            for (int i = 0; i < 5; i++){
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++){
                System.out.println("B");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
