package practice_9.part1;

public class Anonymous {
    static Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello from anonymous class!");
        }
    };

    public static void main(String[] args) {
        r.run();
    }
}
