package core;

/**
 * Using an enum for a singleton is 100% guaranteed that only one instance of the singleton is present within a JVM.
 */
public enum EnumSingleton {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
