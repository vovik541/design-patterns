package creational.singleton.non_thread_safe;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println("Singleton would be reused (FIRST)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FIRST");
        Singleton anotherSingleton = Singleton.getInstance("SECOND");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}