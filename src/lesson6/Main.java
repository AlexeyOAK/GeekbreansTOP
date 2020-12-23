package lesson6;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        dog.run(555);
        dog.swim(3);
        Animal.count++;
        Dog dog1 = new Dog("Бивень");
        dog1.run(345);
        dog1.swim(6);
        Animal.count++;
        Cat cat = new Cat("Муся");
        cat.run(190);
        cat.swim(3);
        Animal.count++;
        System.out.println("Всего животных " + Animal.count);
    }
}
