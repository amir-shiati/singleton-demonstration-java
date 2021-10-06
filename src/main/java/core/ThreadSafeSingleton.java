package core;

/**
 * Same exact principle as the LazyInitializedSingleton.
 * except that it's a thread-safe singleton.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        return instance == null ? instance = new ThreadSafeSingleton() : instance;
    }
}
