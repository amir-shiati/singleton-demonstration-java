package core;

/**
 * Same exact principle as the EagerInitializedSingleton.
 * except hat instance of class is created in the static block that provides option for exception handling.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "@" + this.hashCode();
    }

}
