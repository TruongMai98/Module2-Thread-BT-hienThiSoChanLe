public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread th1 = new Thread(oddThread);
        Thread th2 = new Thread(evenThread);

        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th2.start();

    }
}