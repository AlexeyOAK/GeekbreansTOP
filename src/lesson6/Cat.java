package lesson6;

class Cat extends Animal{
    private final int MAX_RUN_LENGTH = 200;
    private String name;

    public Cat (String name) {
        this.name = name;

    }
    @Override
    void run(int length) {
        if (length >= 0 && length <= MAX_RUN_LENGTH)
            System.out.println(name + " пробежала " + length + "m");
        else
            System.out.println("Это слишком много для кошки. " + MAX_RUN_LENGTH + "m это мой предел");
    }

    @Override
    void swim(int length) {
        System.out.println("Я не умею плавать, ПОМОГИТЕ!!!!!");
    }
}
