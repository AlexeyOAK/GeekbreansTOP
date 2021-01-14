package lvl2lesson1;

import lvl2lesson1.hurdles.Hurdles;
import lvl2lesson1.hurdles.Treadmill;
import lvl2lesson1.hurdles.Wall;

public class Main {
    public static void main(String[] args) {
        Game cat1 = new Cat("Mysi",9,12);
        Game cat2 = new Cat("Dodo",11,8);
        Game human1 = new Human("Vasi",12,15);
        Game human2 = new Human("Peti",5,5);
        Game robot1 = new Robot("Dare",100,100);
        Game[] games = {cat1, cat2,human1,human2,robot1};

        Hurdles ret = new Treadmill(10);
        Hurdles ret2 = new Treadmill(11);
        Hurdles wall1= new Wall(10);
        Hurdles wall2 = new Wall(50);
        Hurdles [] hurdles = {ret, ret2,wall1,wall2};

        for (Hurdles hurd : hurdles) {
            for (Game game : games) {
                if (game.getSesur()) {
                    hurd.chek(game);
                }
            }
        }
    }
}
