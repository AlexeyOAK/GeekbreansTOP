package lesson7;

public class Cat {
    private final String name;
    private final int appetit;
    private boolean satiety;

    public Cat (String name,int appetit, boolean satiety) {
        this.name = name;
        this.appetit = appetit;
        this.satiety = satiety;
    }
    String getName() {
        return name;
    }
    int getAppetit() {
        return appetit;
    }
    boolean getSatiety() {
        return true;
    }
    public void eat (Plate p) {
        p.decreaseFood(appetit);
    }
}
