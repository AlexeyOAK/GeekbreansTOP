package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("vava", 100, false);
        cat[1] = new Cat("kola", 200, false);
        cat[2] = new Cat("lola", 300, false);
        Plate plate = new Plate(500);
        System.out.print("Изначально в миске корма: ");
        plate.info();
        for (Cat i : cat) {
                if(!plate.checkFood(i.getAppetit())) {
                    plate.massFood();
                }
                i.eat(plate);
                System.out.println("кот " + i.getName() + " съел " + i.getAppetit() + " и он сыт " + i.getSatiety());

        }
        System.out.print("в миске осталось: ");
        plate.info();

    }
}
