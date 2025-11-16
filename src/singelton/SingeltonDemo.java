package Singelton;

/**
 * Simple Singleton implementation using the Holder pattern.
 *
 * Purpose:
 * Ensures only one instance of this class exists and provides
 * a global access point to it.
 */
public class SingeltonDemo {

    // Private constructor prevents external instantiation.
    private SingeltonDemo() {}

    // Inner static class holding the single instance.
    // Loaded only when getInstance() is called.
    private static class SingeltonHolder
    {
        private static final SingeltonDemo SINGLE_INSTANCE = new SingeltonDemo();
    }

    // Returns the single instance of the class.
    public static SingeltonDemo getInstance()
    {
        return SingeltonHolder.SINGLE_INSTANCE;
    }
}
