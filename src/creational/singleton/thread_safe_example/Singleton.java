package creational.singleton.thread_safe_example;

public final class Singleton {
    // Volatile so that double check lock would work correctly.
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // Uses double-checked locking (DCL) to safely create singleton without overhead.
        // DCL pattern: safe and efficient singleton with memory model fix.

        // Local variable avoids issues from Java memory model.
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}