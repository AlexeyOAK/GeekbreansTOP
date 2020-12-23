package lesson6;

abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    static int count = 0;
    abstract void run (int length);
    abstract void swim (int length);



}
