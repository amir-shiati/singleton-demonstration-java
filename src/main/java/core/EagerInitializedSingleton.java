package core;

/**
 * Instance is created even though client application might not be using it.
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "@" + this.hashCode();
    }
}
