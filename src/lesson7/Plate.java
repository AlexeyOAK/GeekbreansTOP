package lesson7;

public class Plate {
    private int food;
    public Plate (int food) {
        this.food = food;
    }
    public void decreaseFood (int n) {
        food -= n;
    }
    public boolean checkFood(int n) {
        return food - n >= 0;
    }
    public void massFood (){
        food += 500;
        System.out.println("еды не хватало и после добавки в миске стало: " + food);
    }

    public void info () {
        System.out.println(food);
    }
}
