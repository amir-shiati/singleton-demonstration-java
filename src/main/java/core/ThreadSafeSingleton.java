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

    /**
     * the synchronized block is used inside the if condition with an additional check to ensure that
     * only one instance of a singleton class is created.
     *
     * @return
     */
    public static ThreadSafeSingleton getInstanceDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
