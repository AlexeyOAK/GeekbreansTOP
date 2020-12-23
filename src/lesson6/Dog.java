package lesson6;

class Dog extends Animal{
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;
    private String name;

    public Dog (String name){
        this.name =name;
    }

    @Override
    void run( int length) {
        if (length >= 0 && length <= MAX_RUN_LENGTH)
            System.out.println(name + " пробежал " + length + "m");
        else
            System.out.println("Это слишком много для собаки. " + MAX_RUN_LENGTH + "m это мой предел");

    }

    @Override
    void swim(int length) {
    if (length >= 0 && length <= MAX_SWIM_LENGTH)
        System.out.println(name + " проплыл " + length + "m");
    else
        System.out.println("Это слишком много для собари. " + MAX_SWIM_LENGTH + "m это мой предел");

    }
}
