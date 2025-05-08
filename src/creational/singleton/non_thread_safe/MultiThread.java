package creational.singleton.non_thread_safe;

public class MultiThread {
    public static void main(String[] args) {
        System.out.println("2 singletons were created (FIRST / SECOND). Works only thread local." + "\n\n" +
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