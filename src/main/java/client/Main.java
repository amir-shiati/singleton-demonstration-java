package client;

import core.*;

public class Main {
    public static void main(String[] args) {
        new Main().initEagerInitializedSingleton();
        new Main().initLazyInitializedSingleton();
        new Main().initStaticBlockSingleton();
        new Main().initThreadSafeSingleton();
        new Main().initEnumSingleton();
    }

    private void initEnumSingleton() {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        int a = enumSingleton.getValue();
        System.out.println(a);
        enumSingleton.setValue(5);
        System.out.println(enumSingleton.getValue());

        // Creating another object
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        // The value is the same with the "enumSingleton" value.
        System.out.println(enumSingleton2.getValue());
    }

    private void initThreadSafeSingleton() {
        Thread thread = new Thread(() -> {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
            System.out.println(threadSafeSingleton);
        });

        Thread thread2 = new Thread(() -> {
            ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
            System.out.println(threadSafeSingleton2);
        });

        thread.start();
        thread2.start();
    }

    private void initStaticBlockSingleton() {
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();
        System.out.println(staticBlockSingleton);
        System.out.println(staticBlockSingleton2);
    }

    private void initLazyInitializedSingleton() {
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance();
        System.out.println(lazyInitializedSingleton);
        System.out.println(lazyInitializedSingleton2);
    }

    private void initEagerInitializedSingleton() {
        EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInitializedSingleton2 = EagerInitializedSingleton.getInstance();
        System.out.println(eagerInitializedSingleton1);
        System.out.println(eagerInitializedSingleton2);
    }
}
