package practice_10;

public class Volatile {
    private static volatile boolean stop = false;
    private static int count;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            while(!stop) {
                count++;
            }
        };
        Thread t = new Thread(task);
        t.start();
        Thread.sleep(2000);
        stop = true;
        System.out.print(count);
    }
}
