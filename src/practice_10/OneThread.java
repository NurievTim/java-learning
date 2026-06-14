package practice_10;

public class OneThread {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 5; i++){
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
    }
}
