package creational.singleton.thread_safe_example;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("Singleton would be reused (FIRST/FIRST)" + "\n\n" +
                "RESULT:" + "\n");
        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());
        firstThread.start();
        secondThread.start();
    }

    static class FirstThread implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FIRST");
            System.out.println(singleton.value);
        }
    }

    static class SecondThread implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("SECOND");
            System.out.println(singleton.value);
        }
    }
}
