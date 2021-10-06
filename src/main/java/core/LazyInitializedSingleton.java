package core;

/**
 * To implement Singleton pattern creates the instance in the global access method.
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        return instance == null ? instance = new LazyInitializedSingleton() : instance;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "@" + this.hashCode();
    }
}
